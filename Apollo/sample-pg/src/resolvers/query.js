const { prisma } = require('../database.js');

const Query {
  // Applicant
  matriculation: (parent, args) => {
    return prisma.applicant.findAll({});
  },
  applicant: (parent,args) => {},
  applicants: (parent, args) => {},
  // Tutor
};

module.exports = {
  Query,
}
