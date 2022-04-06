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

const Tutor = {};

const Ambit = {};

const Academy = {};

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
