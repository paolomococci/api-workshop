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
    return prisma.tutor.findById({});
  },
  tutors: (parent, args) => {
    return prisma.tutor.findAll({});
  },
  // Ambit
  ambit: (parent, args) => {},
  ambits: (parent, args) => {},
  // Academy
  academy: (parent, args) => {},
  academies: (parent, args) => {},
};

module.exports = {
  Query,
}
