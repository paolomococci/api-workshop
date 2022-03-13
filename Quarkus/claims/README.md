# claims

This Application could be defined as the essential version of jwt-outcome

## scaffolding

```shell
mvn io.quarkus.platform:quarkus-maven-plugin:2.7.4.Final:create -DprojectGroupId=local.example -DprojectArtifactId=claims -DclassName="local.example.outcome.OutcomeResource" -Dpath="/outcome" -Dextensions="resteasy-jackson"
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

## example of POST request made using curl and its signed response

it begins with a first request

```shell
curl -i -X POST -H "Content-Type: application/json" -d '{"country":"Fantasy","city":"Someone","name":"James Doe","email":"james.doe@example.local","subject":"some sample subject"}' http://127.0.0.1:8080/outcome/jwt
HTTP/1.1 200 OK
Content-Type: application/json
content-length: 650

{"signedStrings":["eyJhbGciOiJSUzI1NiJ9.eyJjb3VudHJ5IjoiRmFudGFzeSIsImNpdHkiOiJTb21lb25lIiwibmFtZSI6IkphbWVzIERvZSIsImVtYWlsIjoiamFtZXMuZG9lQGV4YW1wbGUubG9jYWwiLCJzdWIiOiJzb21lIHNhbXBsZSBzdWJqZWN0IiwianRpIjoiNGEzZmZkNDMtYTdkMS00NzJiLWFmYTctMzJhMTIyMTgxYTNiIiwiaWF0IjoxNjQ3MjA0NDczLCJleHAiOjE2NDcyMDYyNzN9.hz3DZVSnUgfVAQBdfs4ouTEyfx6WAUrJ5SYJiHH33eHWMQsXSzRYMkqJy_c1xiqVBJOwMp-zgJKmIu0HcWZBS1zesuu0Moj5VqWRzEZ8BQ95K-2fyUwOKkoJk_gBQIQrOBbJCadJmTTMRso7jmzXokwUM5gdn3H_ljZXLQxu3gVc3E6Np7EJg9lpiqOS0Qtxjz2Z1wQkanV1q8lWFlQK3IojZPeqxvHTBOI4LfMW8aCWorTx4pvbcu936JdBko1CIi_vZQJasy99dPzxWo2FuYa16Lj1fDBym11juzEA7UTXLPxxwHIdpuh83ibw7z3k8qRdO0V1--PhDQOciZk7kA"]}
```

and then a second request

```shell
curl -i -X POST -H "Content-Type: application/json" -d '{"country":"Fantasy","city":"Someone","name":"Amy Doe","email":"amy.doe@example.local","subject":"some sample subject"}' http://127.0.0.1:8080/outcome/jwt
HTTP/1.1 200 OK
Content-Type: application/json
content-length: 1276

{"signedStrings":["eyJhbGciOiJSUzI1NiJ9.eyJjb3VudHJ5IjoiRmFudGFzeSIsImNpdHkiOiJTb21lb25lIiwibmFtZSI6IkphbWVzIERvZSIsImVtYWlsIjoiamFtZXMuZG9lQGV4YW1wbGUubG9jYWwiLCJzdWIiOiJzb21lIHNhbXBsZSBzdWJqZWN0IiwianRpIjoiNGEzZmZkNDMtYTdkMS00NzJiLWFmYTctMzJhMTIyMTgxYTNiIiwiaWF0IjoxNjQ3MjA0NDczLCJleHAiOjE2NDcyMDYyNzN9.hz3DZVSnUgfVAQBdfs4ouTEyfx6WAUrJ5SYJiHH33eHWMQsXSzRYMkqJy_c1xiqVBJOwMp-zgJKmIu0HcWZBS1zesuu0Moj5VqWRzEZ8BQ95K-2fyUwOKkoJk_gBQIQrOBbJCadJmTTMRso7jmzXokwUM5gdn3H_ljZXLQxu3gVc3E6Np7EJg9lpiqOS0Qtxjz2Z1wQkanV1q8lWFlQK3IojZPeqxvHTBOI4LfMW8aCWorTx4pvbcu936JdBko1CIi_vZQJasy99dPzxWo2FuYa16Lj1fDBym11juzEA7UTXLPxxwHIdpuh83ibw7z3k8qRdO0V1--PhDQOciZk7kA","eyJhbGciOiJSUzI1NiJ9.eyJjb3VudHJ5IjoiRmFudGFzeSIsImNpdHkiOiJTb21lb25lIiwibmFtZSI6IkFteSBEb2UiLCJlbWFpbCI6ImFteS5kb2VAZXhhbXBsZS5sb2NhbCIsInN1YiI6InNvbWUgc2FtcGxlIHN1YmplY3QiLCJqdGkiOiJlMjY5NWE2ZC00M2M0LTQxOTYtYTY4MC1kZmZhNjM0YWRmN2YiLCJpYXQiOjE2NDcyMDQ1MzUsImV4cCI6MTY0NzIwNjMzNX0.ssOwzPg5enqZEJbPzZcMSnnQ7TG64biUOlD1D9qxRlZe69on3OdbnQAmcZwn0JNj2xTEfb_Xbr4SEkKZJSHY43lcrf3jgGlQCscgOS5SftUKT9c2cNsrBT5CHn5pF1J8OzDTPsLCTPMY8PtQ5etVPiqmXQJymU1o0qRXM1oDEySKPaVT6xZvDgFm09b7yXJFSU6Bn7D3YaRHRS864lEOmmJqheMZT0wt-98_ziP3RFigWtJKMv0ViFcBi4UYyj_OfGet8j5QL7g6axDFGVwYRRk5rC5a-5WgYVzZSkQCncDXuHpMQGf1fMkZJ5eOh-AkwROGHqtM187FYwUGr5MU5g"]}
```
