# dummy-users API Project

## scaffolding

```shell
mvn io.quarkus.platform:quarkus-maven-plugin:2.16.3.Final:create -DprojectGroupId=local.example -DprojectArtifactId=dummy-users -DclassName="local.example.outcome.OutcomeResource" -Dpath="/outcome" -Dextensions="kotlin,resteasy-reactive-jackson" -DbuildTool=gradle
```

## run in development mode

```
gradle quarkusDev
```

## Now I try the application with some shell commands

```shell
curl -i http://127.0.0.1:8090/outcome
```

Getting:

```text

HTTP/1.1 200 OK
Content-Type: application/json
content-length: 0
```

Now I try to log the data of a fictitious user into the system:

```shell
curl -d '{"name":{"title":"developer","first":"John","second":"Doe"},"email":"john.doe@example.local","phone":"032165497","cell":"3210456789","picture":{"large":"","medium":"","thumbnail":""}}' -H "Content-Type: application/json" -X POST http://127.0.0.1:8090/outcome
```

Getting:

```text
[{"login":{"uuid":"5478d7f4-d75f-41d2-9b98-117438d99685"},"name":{"title":"developer","first":"John","second":"Doe"},"email":"john.doe@example.local","phone":"032165497","cell":"3210456789","picture":{"large":"","medium":"","thumbnail":""}}]
```

Finally, I try to ask for a list of fictitious users registered so far.

```shell
curl -i http://127.0.0.1:8090/outcome
```

Which naturally amounts to only one:

```text
HTTP/1.1 200 OK
Content-Type: application/json;charset=UTF-8
content-length: 241

[{"login":{"uuid":"5478d7f4-d75f-41d2-9b98-117438d99685"},"name":{"title":"developer","first":"John","second":"Doe"},"email":"john.doe@example.local","phone":"032165497","cell":"3210456789","picture":{"large":"","medium":"","thumbnail":""}}]
```

If I intend to retrieve a specific record:

```shell
curl -i http://127.0.0.1:8090/outcome/5478d7f4-d75f-41d2-9b98-117438d99685
```

Getting:

```text
HTTP/1.1 200 OK
content-length: 239
Content-Type: application/json;charset=UTF-8

{"login":{"uuid":"5478d7f4-d75f-41d2-9b98-117438d99685"},"name":{"title":"developer","first":"John","second":"Doe"},"email":"john.doe@example.local","phone":"032165497","cell":"3210456789","picture":{"large":"","medium":"","thumbnail":""}}
```

And, if I delete a specific record:

```shell
curl -i -X DELETE http://127.0.0.1:8090/outcome/5478d7f4-d75f-41d2-9b98-117438d99685
```