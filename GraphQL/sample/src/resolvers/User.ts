import {
  IUser,
  IPost,
  IComment
} from '../database/db'
import { TResolvers } from './Query'

const User = {
  posts: (
    (
      parent,
      args,
      {db},
      info
    ) => {
      return db.posts.filter(
        (post) => {
          return post.author === parent.id
        }
      )
    }
  ) as TResolvers<IUser, {}, IPost[]>,
  comments: (
    (
      parent,
      args,
      {db},
      info
    ) => {
      return db.comments.filter(
        (comment) => comment.author === parent.id
      )
    }
  ) as TResolvers<IUser, {}, IComment[]>,
}

export default User
