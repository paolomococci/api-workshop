const { prisma } = require('../database.js');

const Query {
  // Applicant
  matriculation: (parent, args) => {
    return prisma.applicant.findAllActives({
      where: {
        isActive: true
      },
    });
  },
  applicant: (parent,args) => {
    return prisma.applicant.findById({
      where: {
        id: Number(args.id)
      },
    });
  },
  applicants: (parent, args) => {
    return prisma.applicant.findAll({});
  },
  // Tutor
  tutor: (parent, args) => {
    return prisma.tutor.findById({
      where: {
        id: Number(args.id)
      },
    });
  },
  tutors: (parent, args) => {
    return prisma.tutor.findAll({});
  },
  // Ambit
  ambit: (parent, args) => {
    return prisma.ambit.findById({
      where: {
        id: Number(args.id)
      },
    });
  },
  ambits: (parent, args) => {
    return prisma.ambit.findAll({});
  },
  // Academy
  academy: (parent, args) => {
    return prisma.academy.findById({});
  },
  academies: (parent, args) => {
    return prisma.academy.findAll({});
  },
};

module.exports = {
  Query,
}
