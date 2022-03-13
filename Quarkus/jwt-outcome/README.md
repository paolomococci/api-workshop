# jwt-outcome

## scaffolding

```shell
mvn io.quarkus.platform:quarkus-maven-plugin:2.7.4.Final:create -DprojectGroupId=local.example -DprojectArtifactId=jwt-outcome -DclassName="local.example.outcome.OutcomeResource" -Dpath="/outcome" -Dextensions="resteasy-jackson"
```

## run application in development mode

```shell
./mvnw quarkus:dev
```

## private and public key

Open a terminal in the resource folder and type the following shell commands to generate the private and public key.

I generate a private key:

```shell
openssl genrsa -out privateKey.pem 2048
```

I convert private key to format DER

```shell
openssl pkcs8 -topk8 -inform PEM -outform DER -in privateKey.pem -out privateKey.der -nocrypt
```

I generate a public key:

```shell
openssl rsa -in privateKey.pem -pubout -outform DER -out publicKey.der
```

## example of POST request made using curl and its unsigned response

```shell
curl -i -X POST -H "Content-Type: application/json" -d '{"country":"Fantasy","city":"Someone","name":"James Doe","email":"james.doe@example.local","subject":"some sample subject"}' http://127.0.0.1:8080/outcome/unsigned
HTTP/1.1 200 OK
Content-Type: text/plain;charset=UTF-8
content-length: 285

eyJhbGciOiJub25lIn0.eyJjb3VudHJ5IjoiRmFudGFzeSIsImNpdHkiOiJTb21lb25lIiwibmFtZSI6IkphbWVzIERvZSIsImVtYWlsIjoiamFtZXMuZG9lQGV4YW1wbGUubG9jYWwiLCJzdWIiOiJzb21lIHNhbXBsZSBzdWJqZWN0IiwianRpIjoiNWVkOTYwNjUtMTQ0Zi00ZmJlLTg0ZWEtOWZlNTI1MGRhNGIzIiwiaWF0IjoxNjQ3MTg5NzQ3LCJleHAiOjE2NDcxOTMzNDd9.
```

## example of POST request made using curl and its signed response

```shell
curl -i -X POST -H "Content-Type: application/json" -d '{"country":"Fantasy","city":"Someone","name":"James Doe","email":"james.doe@example.local","subject":"some sample subject"}' http://127.0.0.1:8080/outcome/signed
HTTP/1.1 200 OK
Content-Type: text/plain;charset=UTF-8
content-length: 628

eyJhbGciOiJSUzI1NiJ9.eyJjb3VudHJ5IjoiRmFudGFzeSIsImNpdHkiOiJTb21lb25lIiwibmFtZSI6IkphbWVzIERvZSIsImVtYWlsIjoiamFtZXMuZG9lQGV4YW1wbGUubG9jYWwiLCJzdWIiOiJzb21lIHNhbXBsZSBzdWJqZWN0IiwianRpIjoiNGYzMjk3YzQtNzJhZS00ZmU5LWFmYzktZmUyYzM5ZGZlZWQ3IiwiaWF0IjoxNjQ3MTkwMzg2LCJleHAiOjE2NDcxOTIxODZ9.WJCm5qW1DDaj-Psjo-9rYSFISO4fw_ebkbWC5Cmvusw5thy4z5dtP1RXm6yNkB1TAQIqJPYnAdyvowoVjp4J9VyeIcV2q7kb2SWg9oEsJZgWVnpiOiyxuVESXVZ__sRCz0KlGMVhE-hJ2KQWx3KaaMOJnENtQ1B5YQQVi1Jjkjgy0JrBd2msHyEH-Fpp7pApKZ92u7isHx0xbPOxmik2a-qbxRK2shl1ZL2bcp_e7HrlJ_4MQJ9tUHvVmy23pRVxYcvFLDCvvv26Iy7ab3HTFS0owGtKyS9-VJyMcf6ZBgXnpCtwkKqj86Ut-il4xNDsIS9EgP0ptFFrfH_XvHBVGA
```