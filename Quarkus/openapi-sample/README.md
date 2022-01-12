# openapi-sample

Web application developed thanks to the Quarkus.
It could be said that this is a "relaxed" version of CRUD application.

## Scaffolding

```shell
mvn io.quarkus.platform:quarkus-maven-plugin:2.6.2.Final:create -DprojectGroupId=local.example -DprojectArtifactId=openapi-sample -DclassName="local.example.openapi.SampleResource" -Dpath="/sample" -Dextensions="resteasy,resteasy-jackson,quarkus-smallrye-openapi" -DbuildTool=gradle 2>error.log 1>outcome.log
```

## Run application

```shell
./gradlew quarkusDev
```

## Create

```shell
curl -X 'POST' \
  'http://127.0.0.1:8080/sample' \
  -H 'accept: application/json' \
  -H 'Content-Type: application/json' \
  -d '{"name":"seven","definition":"sample number seven"}'
```

## Read

```shell
curl -X 'GET' 'http://127.0.0.1:8080/sample' -H 'accept: application/json'
```

## Update

```shell
curl -X 'PUT' \
  'http://127.0.0.1:8080/sample' \
  -H 'accept: application/json' \
  -H 'Content-Type: application/json' \
  -d '{"name":"two","definition":"sample number two"}'
```

## Delete

```shell
curl -X 'DELETE' \
  'http://127.0.0.1:8080/sample' \
  -H 'accept: application/json' \
  -H 'Content-Type: application/json' \
  -d '{"name":"one","definition":""}'
```
