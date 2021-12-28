# openapi-sample

Web application developed thanks to the Quarkus.
It could be said that this is a "relaxed" version of CRUD application.

## Scaffolding

```shell
mvn io.quarkus.platform:quarkus-maven-plugin:2.6.1.Final:create -DprojectGroupId=local.example -DprojectArtifactId=openapi-sample -DclassName="local.example.openapi.SampleResource" -Dpath="/sample" -Dextensions="resteasy,resteasy-jackson,quarkus-smallrye-openapi" -DbuildTool=gradle 2>error.log 1>outcome.log
```

## Run application

```shell
./gradlew quarkusDev
```
