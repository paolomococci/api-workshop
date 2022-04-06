const { prisma } = require('../database.js');
const { Query } = require('./query.js');
const { Mutation } = require('./mutation.js');

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
