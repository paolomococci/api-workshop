# impatiens

Example of REST application developed thanks to the "Active Record Pattern" paradigm and the Quarkus framework

## scaffolding:

```shell
mvn io.quarkus.platform:quarkus-maven-plugin:2.14.2.Final:create -DprojectGroupId=local.example -DprojectArtifactId=impatiens -DclassName="local.example.impatiens.ImpatiensResource" -Dpath="/impatiens" -Dextensions="quarkus-resteasy-reactive,quarkus-resteasy-reactive-jackson,quarkus-reactive-routes,quarkus-reactive-pg-client,quarkus-hibernate-reactive-panache" -DbuildTool=gradle
```

## running the application in development mode:

```shell
./gradlew quarkusDev
```
