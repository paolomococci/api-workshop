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
  addTutor: (parent, args) => {
    return prisma.tutor.create({});
  },
  // Ambit
  addAmbit: (parent, args) => {
    return prisma.ambit.create({});
  },
  // Academy
  addAcademy: (parent, args) => {
    return prisma.academy.create({});
  },
};

module.exports = {
  Mutation,
}
