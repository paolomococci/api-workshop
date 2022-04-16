import {
  IUser,
  IPost,
  IComment
} from '../database/db'
import { TResolvers } from './Query'

const Post = {
  /* author */
  author: (
    (
      parent,
      args,
      {db},
      info
    ) => {
      return db.users.find(
        (user) => user.id === parent.author
      )
    }
  ) as TResolvers<IPost, {}, IUser>,
  /* comments */
  comments: (
    (
      parent,
      args,
      {db},
      info
    ) => {
      return db.comments.filter(
        (comment) => comment.post === parent.id
      )
    }
  ) as TResolvers<IPost, {}, IComment[]>,
}

export default Post
