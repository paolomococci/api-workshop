import { ApolloServer, gql } from 'apollo-server';

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