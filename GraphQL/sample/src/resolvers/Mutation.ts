import { v4 } from "uuid"
import {
  IUser,
  IUserUpdate,
  IPost,
  IPostUpdate,
  IComment
} from '../database/db'
import { TResolvers } from './Query'

const Mutation = {
  /* User */
  /* createUser */
  createUser: (
    (
      parent,
      args,
      {db},
      info
    ): IUser => {
      const emailAlreadyExist = db.users.some(
        (user) => user.email === args.data.email
      )
      if (emailAlreadyExist) {
        throw new Error('email already registered as belonging to another user')
      }
      const user = {
        id: v4(),
        ...args.data,
      }
      db.users.push(user)
      return user
    }
  ) as TResolvers<
    any,
    {
      data: {
        name: string;
        email: string;
        age: number
      }
    },
    IUser
  >,
  /* updateUser */
  updateUser: (
    (
      parent,
      args,
      context,
      info
    ) => {
      const { id, data } = args
      const { db } = context
      const find = db.users.find(
        (user) => user.id === id
      )
      if (!find) {
        throw new Error('user not found')
      }
      if (data.email) {
        const emailAlreadyExist = db.users.some(
          (user) => user.email === data.email
        )
        if (emailAlreadyExist) {
          throw new Error('email already assigned to another user')
        }
        find.email = data.email
      }
      if (data.name) {
        find.name = data.name
      }
      if (data.age || data.age === null) {
        find.age = data.age
      }
      return find
    }
  ) as TResolvers<{}, {
    id: string;
    data: IUserUpdate
  }, IUser>,
  /* deleteUser */
  deleteUser: (
    (
      parent,
      args,
      {db},
      info
    ) => {
      const userIndex = db.users.findIndex(
        (user) => user.id === args.id
      )
      if (userIndex < 0) {
        throw new Error('user not registered in the system')
      }
      const deletedUsers = db.users.splice(userIndex, 1)
      db.posts = db.posts.filter((post) => {
        const match = post.author === args.id
        if (match) {
          db.comments = db.comments.filter(
            (comment) => comment.post !== post.id
          )
        }
        return !match
      })
      db.comments = db.comments.filter(
        (comment) => comment.author !== args.id
      )
      return deletedUsers[0]
    }
  ) as TResolvers<any, { id: string }, IUser>,
  /* Post */
  /* createPost */
  createPost: (
    (
      parent,
      args,
      {db, pubsub},
      info
    ): IPost => {
      const userAlreadyExist = db.users.some(
        (user) => user.id === args.data.author
      )
      if (!userAlreadyExist) {
        throw new Error('non-existent user')
      }
      const post = {
        id: v4(),
        ...args.data,
      }
      db.posts.push(post)
      if (post.published) {
        pubsub.publish("post", {
          post: {
            mutation: "CREATED",
            data: post,
          },
        })
      }
      return post
    }
  ) as TResolvers<
    any,
    {
      data: {
        title: string;
        body: string;
        published: boolean;
        author: string;
      }
    },
    IPost
  >,
  /* updatePost */
  updatePost: (
    (
      parent,
      args,
      context,
      info
    ) => {
      const { db, pubsub } = context
      const { id, data } = args
      const post = db.posts.find(
        (post) => post.id === id
      )
      if (!post) {
        throw new Error('post not found')
      }
      const originalPost: IPost = { ...post }
      if (data.title) {
        post.title = data.title
      }
      if (data.body) {
        post.body = data.body
      }
      if (data.published !== undefined) {
        post.published = data.published
      }
      if (data.published && originalPost.published) {
        /* update */
        post.published = data.published
        pubsub.publish("post", {
          post: {
            mutation: "UPDATED",
            data: post,
          },
        })
      } else if (!data.published && originalPost.published) {
        /* delete */
        pubsub.publish("post", {
          post: {
            mutation: "DELETED",
            data: originalPost,
          },
        })
      } else if (data.published && !originalPost.published) {
        /* create */
        post.published = data.published
        pubsub.publish("post", {
          post: {
            mutation: "CREATED",
            data: post,
          },
        })
      }
      return post
    }
  ) as TResolvers<
    any,
    {
      id: string;
      data: IPostUpdate
    },
    IPost
  >,
  /* deletePost */
  deletePost: (
    (
      parent,
      args,
      { db, pubsub },
      info
    ): IPost => {
      const postIndex = db.posts.findIndex(
        (post) => post.id === args.id
      )
      if (postIndex < 0) {
        throw new Error('post not found')
      }
      const deletedPosts = db.posts.splice(postIndex, 1)
      db.comments = db.comments.filter(
        (comment) => comment.post !== args.id
      )
      if (deletedPosts[0].published) {
        pubsub.publish("post", {
          post: {
            mutaion: "DELETED",
            data: deletedPosts[0],
          },
        })
      }
      return deletedPosts[0]
    }
  ) as TResolvers<any, { id: string }, IPost>,
  /* Comment */
  /* createComment */
  createComment: (
    (
      parent,
      args,
      { db, pubsub },
      info
    ): IComment => {
      /* check if the user is registered in the system */
      const userAlreadyExist = db.users.some(
        (user) => user.id === args.data.author
      )
      if (!userAlreadyExist) {
        throw new Error('non-existent user')
      }
      const postAlreadyExist = db.posts.some((post) => {
        return post.id === args.data.post && post.published === true
      })
      if (!postAlreadyExist) {
        throw new Error('post non-existent or not yet published')
      }
      const comment = {
        id: v4(),
        ...args.data,
      }
      db.comments.push(comment)
      pubsub.publish(`comment: ${args.data.post}`, {
        comment: {
          mutation: "CREATED",
          data: comment,
        },
      })
      return comment
    }
  ) as TResolvers<
    any,
    {
      data: {
        post: string;
        author: string;
        text: string
      }
    },
    IComment
  >,
  /* updateComment */
  updateComment: (
    (
      parent,
      args,
      context,
      info
    ) => {
      const { id, text } = args
      const { db, pubsub } = context
      const find = db.comments.find(
        (temp) => temp.id === id
      )
      if (!find) {
        throw new Error('comment not found')
      }
      find.text = text
      console.log('find', find)
      pubsub.publish(`comment: ${find.post}`, {
        comment: {
          mutation: "UPDATEDd",
          data: find,
        },
      })
      return find
    }
  ) as TResolvers<
    any,
    {
      id: string;
      text: string
    },
    IComment
  >,
  /* deleteComment */
  deleteComment: (
    (
      parent,
      args,
      { db, pubsub },
      info
    ): IComment => {
      const commentIndex = db.comments.findIndex(
        (comment) => comment.id === args.id
      )
      if (commentIndex < 0) {
        throw new Error('comment not found')
      }
      const [deletedComment] = db.comments.splice(commentIndex, 1)
      pubsub.publish(`comment: ${deletedComment.post}`, {
        comment: {
          mutation: "DELETED",
          data: deletedComment,
        },
      })
      return deletedComment
    }
  ) as TResolvers<any, { id: string }, IComment>,
}

export default Mutation
