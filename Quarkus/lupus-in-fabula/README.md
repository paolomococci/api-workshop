# lupus in fabula

an example of a Web API implemented with GraphQL

```text
lupus in fabula venit enim ad me
```
Cicerone

## scaffolding

```shell
mvn io.quarkus.platform:quarkus-maven-plugin:2.8.1.Final:create -DprojectGroupId=local.example -DprojectArtifactId=lupus-in-fabula -Dextensions="resteasy,graphql" -DnoCode
```

## to run in development mode

```shell
./mvnw quarkus:dev
```
