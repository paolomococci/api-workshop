# lupus in fabula

an example of a Web API implemented with GraphQL

```text
lupus in fabula venit enim ad me
```
Cicerone

## scaffolding

```shell
mvn io.quarkus.platform:quarkus-maven-plugin:2.7.5.Final:create -DprojectGroupId=local.example -DprojectArtifactId=lupus-in-fabula -DclassName="local.example.outcome.OutcomeResource" -Dpath="/outcome" -Dextensions="resteasy,graphql" -DnoCode
```
