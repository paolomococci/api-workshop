const { prisma } = require('../database.js');

const Query {
  matriculation: (parent, args) => {
    return prisma.applicant.findAll({});
  },
};

module.exports = {
  Query,
}
