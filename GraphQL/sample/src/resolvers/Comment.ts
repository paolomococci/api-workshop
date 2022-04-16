import {
  IUser,
  IPost,
  IComment
} from '../database/db'
import { TResolvers } from './Query'

const Comment = {
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
  ) as TResolvers<IComment, {}, IUser>,
  /* post */
  post: (
    (
      parent: IComment,
      args,
      {db},
      info
    ) => {
      return db.posts.find(
        (post) => post.id === parent.post
      )
    }
  ) as TResolvers<IComment, {}, IPost>,
}

export default Comment
