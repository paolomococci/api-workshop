import { makeExecutableSchema } from '@graphql-tools/schema'

const typeDefinitions =  `
  type Query {
    hello: String!
  }
`

const resolvers = {
  Query: {
    hello: () => 'Hello from sample query!',
  },
}
