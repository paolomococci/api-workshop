const { ApolloServer, gql } = require('apollo-server');

const typeDefs = gql`
  type Movie {
    title: String
    director: String
    producer: String
  }

  type Query {
    movies: [Movie]
  }
`;

/* dataset */

const movies = [
  {
    title: 'Sample One',
    director: 'John Doe',
    producer: 'Jane Doe'
  },
  {
    title: 'Sample One',
    director: 'James Doe',
    producer: 'Amy Doe'
  },
];

/* resolvers is a technique for retrieving the types defined in the schema */

const resolvers = {
  Query: {
    movies: () => movies,
  },
};

/* server */

const server = new ApolloServer({ typeDefs, resolvers});

server.listen().then(
  ({url}) => {
    console.log(`server waiting for requests: ${url}`);
  }
);
