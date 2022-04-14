# hello

really basic example of using GraphQL

## scaffolding

```shell
mkdir hello
cd hello
npm init --yes
```
### add some dependencies

```shell
npm i graphql @graphql-yoga/node
```

## examples of use

### test

```shell
npm run test
```

response:

```text

> hello@1.0.0 test
> echo "Error: no test specified" && exit 1

Error: no test specified
```

### start

```shell
npm run start
```

response:

```text

> hello@1.0.0 start
> node src/index.js

{
  data: [Object: null prototype] { hello: 'Hello from sample query!' }
}
```
