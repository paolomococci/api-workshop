# account 

## scaffolding

```shell
mvn io.quarkus.platform:quarkus-maven-plugin:2.16.1.Final:create -DprojectGroupId=local.example -DprojectArtifactId=account -DclassName="local.example.outcome.OutcomeResource" -Dpath="/outcome" -Dextensions="kotlin,resteasy-reactive-jackson" -DbuildTool=gradle
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

{"accountNumber":"3816f557-a83b-4f2d-81ba-df52719ab791","customerNumber":"3560308d-2f9d-468f-9484-7ff0fdea7d08","customerName":"John Doe","balance":1300.00,"accountStatus":"OPEN"}
```

Now I try to get the data by adding the account identifier to the path:

```shell
curl -i -X GET http://127.0.0.1:8080/outcome/3816f557-a83b-4f2d-81ba-df52719ab791
```

getting:

```text
HTTP/1.1 200 OK
content-length: 179
Content-Type: application/json;charset=UTF-8

{"accountNumber":"3816f557-a83b-4f2d-81ba-df52719ab791","customerNumber":"3560308d-2f9d-468f-9484-7ff0fdea7d08","customerName":"John Doe","balance":1300.00,"accountStatus":"OPEN"}
```
