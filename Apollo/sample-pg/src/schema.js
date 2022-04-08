const { gql } = require('apollo-server')

const typeDefs = gql `

type Applicant {
  id: ID!
  email: String!
  name: String
  surname: String
  username: String
  isActive: Boolean
  applicantAcademyRelation: Academy
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
  username: String
  isActive: Boolean
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
  tutors: [Tutor!]!
  tutor(id: ID!): Tutor
  matriculation: Boolean
}

type Mutation {
  addApplicant(
    email: String!,
    name: String,
    surname: String,
    academyId: Int!
  ): Applicant!
  matriculate(id: ID): Applicant
  addTutor(data: CreateTutor!): Tutor!
  addAcademy(
    code: String!,
    title: String!,
    tutorEmail: String
  ): Academy!
  addAmbit(
    name: String!,
    description: String
  ): Ambit!
}

enum TutorType {
  FULLTIME
  PARTTIME
}

input CreateTutor {
  email: String!
  name: String
  surname: String
  academies: [CreateAcademy]
}

input CreateAcademy {
  code: String!
  title: String
  description: String
}
`

module.exports = {
  typeDefs
}
