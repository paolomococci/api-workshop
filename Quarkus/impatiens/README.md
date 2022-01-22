# impatiens


## scaffolding

```shell
mvn io.quarkus.platform:quarkus-maven-plugin:2.6.3.Final:create -DprojectGroupId=local.example -DprojectArtifactId=impatiens -DclassName="local.example.impatiens.ImpatiensResource" -Dpath="/impatiens" -Dextensions="quarkus-resteasy-reactive,quarkus-resteasy-reactive-jackson,quarkus-reactive-routes,quarkus-reactive-pg-client,quarkus-hibernate-reactive-panache" -DbuildTool=gradle
```

