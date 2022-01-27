# billing

## scaffolding

```shell
mvn io.quarkus.platform:quarkus-maven-plugin:2.6.3.Final:create -DprojectGroupId=local.example -DprojectArtifactId=billing -DclassName="local.example.billing.BillingResource" -Dpath="/billing" -Dextensions="quarkus-resteasy-reactive,quarkus-resteasy-reactive-jackson,quarkus-reactive-routes,quarkus-reactive-pg-client,quarkus-hibernate-reactive-panache" -DbuildTool=gradle
```

## running the application in development mode:

```shell
./gradlew quarkusDev
```
