const { gql } = require('apollo-server')

const typeDefs = gql

type Applicant {
  id: ID!
  email: String!
  name: String
  surname: String
}

type Ambit {}

type Tutor {}

type Academy {}

type Query {}

type Mutation {}

enum TutorTypr {}

input CreateTutor {}

input CreateAcademy {}
