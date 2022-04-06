const { prisma } = require('../database.js');
const { Query } = require('./query.js');
const { Mutation } = require('./mutation.js');

const Applicant = {
  id: (parent, args, context, info) => parent.id,
  email: (parent) => parent.email,
  name: (parent) => parent.name,
  surname: (parent) => parent.surname,
  isActive: (parent) => parent.isActive,
  applicantAcademyRelation: (parent, args) => {
    return prisma.academy.findById({
      where: {
        id: parent.applicantAcademyRelation
      },
    });
  },
};

const Tutor = {
  id: (parent) => parent.id,
  email: (parent) => parent.email,
  name: (parent) => parent.name,
  surname: (parent) => parent.surname,
  academies: (parent, args) => {
    return prisma.tutor.find({
      where: {
        id: parent.id
      },
    }).academies();
  },
};

const Ambit = {
  id: (parent) => parent.id,
  name: (parent) => parent.name,
  description: (parent) => parent.description,
  applicants: (parent, args) => {
    return prisma.ambit.find({
      where: {
        id: parent.id
      },
    }).applicants();
  },
  academies: (parent, args) => {
    return prisma.ambit.find({
      where: {
        id: parent.id
      }
    }).academies();
  },
};

const Academy = {
  id: (parent) => parent.id,
  code: (parent) => parent.code,
  title: (parent) => parent.title,
  description: (parent) => parent.description,
  tutor: (parent, args) => {
    return prisma.academy.find({
      where: {
        id: parent.id
      },
    }).tutor();
  },
  ambit: (parent, args) => {
    return prisma.academy.find({
      where: {
        id: parent.id
      },
    }).ambit();
  },
};

const resolvers {
  Applicant,
  Tutor,
  Ambit,
  Academy,
  Query,
  Mutation
};

module.exports = {
  resolvers
};
