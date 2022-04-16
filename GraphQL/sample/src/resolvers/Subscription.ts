import {
  IPost,
  IComment
} from '../database/db'
import { TResolvers } from './Query'

const commentSubscription: TResolvers<
  any, {postId:string}, AsyncIterator<IComment>
> = (
  parent,
  args,
  context,
  info
) => {
  const {pubsub, db} = context
  const { postId } = args
  const post = db.posts.find(
    post => post.id === postId && post.published
  )
  if (!post) throw new Error("post not found")

  return pubsub.asyncIterator<IComment>(`comment:${postId}`)
}

const postSubscription: TResolvers<any, {}, AsyncIterator<IPost>> = (
  parent,
  args,
  context,
  info
) => {
  const {pubsub} = context

  return pubsub.asyncIterator('post')
}

export default {
  comment: {
    subscribe: commentSubscription
  },
  post: {
    subscribe: postSubscription
  }
}
