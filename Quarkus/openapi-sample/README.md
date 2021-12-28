# openapi-sample

## Scaffolding

```shell
mvn io.quarkus.platform:quarkus-maven-plugin:2.6.1.Final:create -DprojectGroupId=local.example -DprojectArtifactId=openapi-sample -DclassName="local.example.openapi.SampleResource" -Dpath="/sample" -Dextensions="resteasy,resteasy-jackson" -DbuildTool=gradle 2>error.log 1>outcome.log
```
