const { gql } = require('apollo-server')

const typeDefs = gql `

type Applicant {
  id: ID!
  email: String!
  name: String
  surname: String
  username: String
  isActive: Boolean
  academy: Academy
  ambit: Ambit
  registeredAt: String
  updatedAt: String
}

type Ambit {
  id: ID!
  name: String!
  description: String
  applicants: [Applicant]
  academies: [Academy]
  registeredAt: String
  updatedAt: String
}

type Tutor {
  id: ID!
  email: String!
  name: String
  surname: String
  academies: [Academy]
  registeredAt: String
  updatedAt: String
}

type Academy {
  id: ID!
  code: String!
  title: String
  description: String
  ambit: Ambit
  tutor: Tutor
  applicants: [Applicant]
  registeredAt: String
  updatedAt: String
}

type Query {
  actives: [Applicant!]
  applicants: [Applicant!]
  applicant(id: ID!): Applicant
  ambits: [Ambit!]!
  ambit(id: ID!): Ambit
  academies: [Academy!]!
  academy(id: ID!): Academy

}

type Mutation {}

enum TutorType {}
`

input CreateTutor {
  email: String!
  name: String
  surname: String
  academies: [Createacademy]
}

input CreateAcademy {
  code: String!
  title: String
  description: String
}
