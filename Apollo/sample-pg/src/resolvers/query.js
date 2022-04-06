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
    return prisma.applicant.findById({});
  },
  applicants: (parent, args) => {},
  // Tutor
  tutor: (parent, args) => {},
  tutors: (parent, args) => {},
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
