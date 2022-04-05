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
  name: String!
  description: String
  registeredAt: String
  updatedAt: String
}

type Tutor {
  id: ID!
  email: String!
  name: String
  surname: String
  registeredAt: String
  updatedAt: String
}

type Academy {
  id: ID!
  code: String!
  title: String
  description: String
  registeredAt: String
  updatedAt: String
}

type Query {}

type Mutation {}

enum TutorTypr {}

input CreateTutor {}

input CreateAcademy {}
