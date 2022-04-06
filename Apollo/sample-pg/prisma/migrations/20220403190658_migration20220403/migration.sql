-- CreateEnum
CREATE TYPE "TutorType" AS ENUM ('FULLTIME', 'PARTTIME');

-- CreateTable
CREATE TABLE "applicant" (
    "id" SERIAL NOT NULL,
    "email" VARCHAR(255) NOT NULL,
    "name" VARCHAR(255),
    "surname" VARCHAR(255),
    "username" VARCHAR(255),
    "isActive" BOOLEAN NOT NULL DEFAULT false,
    "academyId" INTEGER NOT NULL,
    "ambitId" INTEGER,
    "registeredAt" TIMESTAMP(3) NOT NULL DEFAULT CURRENT_TIMESTAMP,
    "updatedAt" TIMESTAMP(3) NOT NULL,

    CONSTRAINT "applicant_pkey" PRIMARY KEY ("id")
);

-- CreateTable
CREATE TABLE "ambit" (
    "id" SERIAL NOT NULL,
    "name" TEXT NOT NULL,
    "description" VARCHAR(500),
    "registeredAt" TIMESTAMP(3) NOT NULL DEFAULT CURRENT_TIMESTAMP,
    "updatedAt" TIMESTAMP(3) NOT NULL,

    CONSTRAINT "ambit_pkey" PRIMARY KEY ("id")
);

-- CreateTable
CREATE TABLE "tutor" (
    "id" SERIAL NOT NULL,
    "email" VARCHAR(255) NOT NULL,
    "name" VARCHAR(255),
    "surname" VARCHAR(255),
    "username" VARCHAR(255),
    "isActive" BOOLEAN NOT NULL DEFAULT false,
    "type" "TutorType" NOT NULL DEFAULT E'FULLTIME',
    "registeredAt" TIMESTAMP(3) NOT NULL DEFAULT CURRENT_TIMESTAMP,
    "updatedAt" TIMESTAMP(3) NOT NULL,

    CONSTRAINT "tutor_pkey" PRIMARY KEY ("id")
);

-- CreateTable
CREATE TABLE "academy" (
    "id" SERIAL NOT NULL,
    "code" TEXT NOT NULL,
    "title" VARCHAR(255) NOT NULL,
    "description" VARCHAR(500),
    "tutorId" INTEGER,
    "ambitId" INTEGER,
    "registeredAt" TIMESTAMP(3) NOT NULL DEFAULT CURRENT_TIMESTAMP,
    "updatedAt" TIMESTAMP(3) NOT NULL,

    CONSTRAINT "academy_pkey" PRIMARY KEY ("id")
);

-- CreateIndex
CREATE UNIQUE INDEX "applicant_email_key" ON "applicant"("email");

-- CreateIndex
CREATE UNIQUE INDEX "ambit_name_key" ON "ambit"("name");

-- CreateIndex
CREATE UNIQUE INDEX "tutor_email_key" ON "tutor"("email");

-- CreateIndex
CREATE UNIQUE INDEX "academy_code_key" ON "academy"("code");

-- AddForeignKey
ALTER TABLE "applicant" ADD CONSTRAINT "applicant_ambitId_fkey" FOREIGN KEY ("ambitId") REFERENCES "ambit"("id") ON DELETE SET NULL ON UPDATE CASCADE;

-- AddForeignKey
ALTER TABLE "applicant" ADD CONSTRAINT "applicant_academyId_fkey" FOREIGN KEY ("academyId") REFERENCES "academy"("id") ON DELETE RESTRICT ON UPDATE CASCADE;

-- AddForeignKey
ALTER TABLE "academy" ADD CONSTRAINT "academy_ambitId_fkey" FOREIGN KEY ("ambitId") REFERENCES "ambit"("id") ON DELETE SET NULL ON UPDATE CASCADE;

-- AddForeignKey
ALTER TABLE "academy" ADD CONSTRAINT "academy_tutorId_fkey" FOREIGN KEY ("tutorId") REFERENCES "tutor"("id") ON DELETE SET NULL ON UPDATE CASCADE;
