# jwt-resource

## scaffolding

```shell
mvn io.quarkus.platform:quarkus-maven-plugin:2.7.1.Final:create -DprojectGroupId=local.example -DprojectArtifactId=jwt-resource -DclassName="local.example.outcome.JwtOutcomeResource" -Dpath="/outcome" -Dextensions="resteasy-jackson"
```

## run application in development mode

```shell
./mvnw quarkus:dev
```
