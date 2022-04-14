import { makeExecutableSchema } from '@graphql-tools/schema'

const typeDefinitions =  `
  type Query {
    hello: String!
  }
`
