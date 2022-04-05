const { gql } = require('apollo-server')

const typeDefs = gql

type Applicant {
  id: ID!
  email: String!
  name: String
  surname: String
  username: String
  isActive: Boolean
  registeredAt: String
  updatedAt: String
}

type Ambit {
  id: ID!
}

type Tutor {
  id: ID!
}

type Academy {
  id: ID!
}

type Query {}

type Mutation {}

enum TutorTypr {}

input CreateTutor {}

input CreateAcademy {}
