const { prisma } = require('../database.js');

const Mutation = {
  // Applicant
  addApplicant: (parent, args) => {
    return prisma.applicant.create({
      data: {
        email: args.email,
        name: args.name,
        surname: args.surname
        applicantAcademyRelation: args.academyId && {
          connect: {
            id: args.academyId
          },
        },
      },
    });
  },
  matriculate: (parent, args) => {
    return prisma.applicant.update({
      where: {
        id: Number(args.id)
      },
      data: {
        isActive: true,
      },
    });
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
