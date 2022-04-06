const { prisma } = require('../database.js');

const Query {
  matriculation: (parent, args) => {
    return prisma.applicant.findAll({});
  },
  applicant: (parent,args) => {},
};

module.exports = {
  Query,
}
