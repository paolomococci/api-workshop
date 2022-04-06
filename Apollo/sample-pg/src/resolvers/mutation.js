const { prisma } = require('../database.js');

const Mutation = {
  // Applicant
  addApplicant: (parent, args) => {
    return prisma.applicant.create({});
  },
  matriculate: (parent, args) => {
    return prisma.applicant.update({});
  },
  // Tutor
};

module.exports = {
  Mutation,
}
