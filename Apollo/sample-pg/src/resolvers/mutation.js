const { prisma } = require('../database.js');

const Mutation = {
  addApplicant: (parent, args) => {
    return prisma.applicant.create({});
  },
  matriculate: (parent, args) => {

  },
};

module.exports = {
  Mutation,
}
