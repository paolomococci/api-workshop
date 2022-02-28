# jwt-outcome

## scaffolding

```shell
mvn io.quarkus.platform:quarkus-maven-plugin:2.7.2.Final:create -DprojectGroupId=local.example -DprojectArtifactId=jwt-outcome -DclassName="local.example.outcome.OutcomeResource" -Dpath="/outcome" -Dextensions="resteasy-jackson"
```

## run application in development mode

```shell
./mvnw quarkus:dev
```

## private and public key

Open a terminal in the resource folder and type the following shell commands to generate the private and public key.

### a prime example

```shell
openssl genrsa -out private.pem 4096
```

```shell
openssl rsa -in private.pem -outform PEM -pubout -out public.pem
```

### a second example

```shell
openssl genrsa -out privateKey.pem 4096
```

```shell
openssl req -new -x509 -key privateKey.pem -out publicKey.pem -days 14
```

## example of POST request made using curl and its unsigned response

```shell
curl -i -X POST -H "Content-Type: application/json" -d '{"country":"Fantasy","city":"Someone","name":"James Doe","email":"james.doe@example.local","subject":"some sample subject"}' http://127.0.0.1:8080/outcome
HTTP/1.1 200 OK
Content-Type: text/plain;charset=UTF-8
content-length: 285

eyJhbGciOiJub25lIn0.eyJjb3VudHJ5IjoiRmFudGFzeSIsImNpdHkiOiJTb21lb25lIiwibmFtZSI6IkphbWVzIERvZSIsImVtYWlsIjoiamFtZXMuZG9lQGV4YW1wbGUubG9jYWwiLCJzdWIiOiJzb21lIHNhbXBsZSBzdWJqZWN0IiwianRpIjoiNTAyNWQ4OGYtZDI2ZS00MTk4LTgyOGUtZTMwYmQxZTNjMWI2IiwiaWF0IjoxNjQ2MDI5NTc4LCJleHAiOjE2NDYwMzMxNzh9.
```
