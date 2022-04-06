const { prisma } = require('../database.js');

const Mutation = {
  // Applicant
  addApplicant: (parent, args) => {
    console.log(parent, args)
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
    return prisma.tutor.create({
      data: {
        email: args.data.email,
        name: args.data.name,
        surname: args.data.surname,
        academies: {
          create: args.data.academies,
        },
      },
    });
  },
  // Ambit
  addAmbit: (parent, args) => {
    return prisma.ambit.create({
      data: {
        name: args.name,
        description: args.description,
      },
    });
  },
  // Academy
  addAcademy: (parent, args) => {
    return prisma.academy.create({
      data: {
        code: args.code,
        title: args.title,
        tutor: args.tutorEmail && {
          connect: {
            email: args.tutorEmail
          },
        },
      },
    });
  },
};

module.exports = {
  Mutation,
}
