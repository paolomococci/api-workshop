# sample-pg

Example of access to data kept in a database.

## scaffolding

```shell
mkdir sample-pg
cd sample-pg
npm init --yes
npm install apollo-server graphql
npm install prisma --save-dev
```

### setup

```shell
npx prisma init
```

### migration of structure of data

```shell
npx prisma migrate dev
```

if there is any problem with the relationships between tables the following command can help

```shell
npx prisma format
```

and

```shell
npm i nodemon --save-dev
```

## setup GraphQL resolvers to read and write data in the database

## start the server

```shell
npm start
```
