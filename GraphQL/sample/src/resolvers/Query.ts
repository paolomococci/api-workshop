import { PubSub } from 'graphql-yoga'
import {
  IUser,
  IPost
} from '../database/db'
import db from '../database/db'

export type TResolvers<TParent, TArgs, TReturn> = (
  parent:TParent,
  args: TArgs,
  context: {
    db: typeof db,
    pubsub: PubSub
  },
  info:any
) => TReturn

const Query = {
/* users */
  users: (
    (
      parent,
      args,
      {db},
      info
    ) => {
      if (!args.query) {
        return db.users
      }
      return db.users.filter(
        (user) => {
          return user.name.toLowerCase()
            .includes(args.query!.toLowerCase())
        }
      )
    }
  ) as TResolvers<any,{ query?: string }, IUser[]>,
/* posts */
  posts: (
    (
      parent,
      args,
      {db},
      info
    ) => {
      if (!args.query) {
        return db.posts
      }
      return db.posts.filter(
        (post) => {
          const isTitleMatch = post.title.toLowerCase()
            .includes(args.query!.toLowerCase())
          const isBodyMatch = post.body.toLowerCase()
            .includes(args.query!.toLowerCase())
          return isTitleMatch || isBodyMatch
        }
      )
    }
  ) as TResolvers<any, { query?: string }, IPost[]>,
/* comments */
  comments: (
    (
      parent,
      args,
      {db},
      info
    ) => {
      return db.comments
    }
  ) as TResolvers<any,any,any>,
  user():IUser {
    return {
      id: "987654",
      name: "John Doe",
      email: "johndoe@example.local",
      age: 35,
    }
  },
  post():IPost {
    return {
      id: "123456",
      title: "Somethings title",
      body: "Any topic for this post",
      published: false,
    }
  },
}

export default Query
