# account 

## scaffolding

```shell
mvn io.quarkus.platform:quarkus-maven-plugin:2.10.3.Final:create -DprojectGroupId=local.example -DprojectArtifactId=account -DclassName="local.example.outcome.OutcomeResource" -Dpath="/outcome" -Dextensions="kotlin,resteasy-reactive-jackson" -DbuildTool=gradle
```

## I start the application in development mode

```shell
./gradlew quarkusDev
```

## now I try to post a first Account object in json format:

```shell
curl -i -X POST -H "Content-Type: application/json" -d '{"customerName":"John Doe","balance":1300.00}' http://127.0.0.1:8080/outcome
```

getting:

```text
HTTP/1.1 201 Created
Content-Type: application/json;charset=UTF-8
content-length: 179

{"accountNumber":"4789f685-13cd-4e45-92ce-9c7da6ce4500","customerNumber":"e7bee949-bf2e-4182-b0aa-043f416fedc3","customerName":"John Doe","balance":1300.00,"accountStatus":"OPEN"}
```
