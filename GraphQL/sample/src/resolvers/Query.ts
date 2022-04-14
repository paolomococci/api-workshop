import { PubSub } from 'graphql-yoga'
import {
  IUser,
  IPost
} from '../database/data'

export type TResolvers<TParent, TArgs, TReturn> = (
  parent:TParent,
  args: TArgs,
  ctx: {
    data: typeof data,
    pubsub: PubSub
  },
  info:any
) => TReturn
