# dummy-accounts Project

## scaffolding

```shell
mvn io.quarkus.platform:quarkus-maven-plugin:2.13.3.Final:create -DprojectGroupId=local.example -DprojectArtifactId=dummy-accounts -DclassName="local.example.outcome.OutcomeResource" -Dpath="/outcome" -Dextensions="kotlin,resteasy-reactive-jackson" -DbuildTool=gradle
```