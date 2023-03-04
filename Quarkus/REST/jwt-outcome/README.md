# jwt-outcome

## scaffolding

```shell
mvn io.quarkus.platform:quarkus-maven-plugin:2.16.4.Final:create -DprojectGroupId=local.example -DprojectArtifactId=jwt-outcome -DclassName="local.example.outcome.OutcomeResource" -Dpath="/outcome" -Dextensions="resteasy-jackson"
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

it begins with a first request

```shell
curl -i -X POST -H "Content-Type: application/json" -d '{"country":"Fantasy","city":"Someone","name":"James Doe","email":"james.doe@example.local","subject":"some sample subject"}' http://127.0.0.1:8080/outcome/unsigned
```

response:

```text
HTTP/1.1 200 OK
Content-Type: application/json
content-length: 309

{"unsignedStrings":["eyJhbGciOiJub25lIn0.eyJjb3VudHJ5IjoiRmFudGFzeSIsImNpdHkiOiJTb21lb25lIiwibmFtZSI6IkphbWVzIERvZSIsImVtYWlsIjoiamFtZXMuZG9lQGV4YW1wbGUubG9jYWwiLCJzdWIiOiJzb21lIHNhbXBsZSBzdWJqZWN0IiwianRpIjoiYzA0Mjk0YTItZGY5MS00YWY2LWFlMDctZGYwOTk2ZjE0YTdmIiwiaWF0IjoxNjQ3MTkyNzQ5LCJleHAiOjE2NDcxOTYzNDl9."]}
```

and then a second request

```shell
curl -i -X POST -H "Content-Type: application/json" -d '{"country":"Fantasy","city":"Someone","name":"Amy Doe","email":"amy.doe@example.local","subject":"some sample subject"}' http://127.0.0.1:8080/outcome/unsigned
```

response:

```text
HTTP/1.1 200 OK
Content-Type: application/json
content-length: 592

{"unsignedStrings":["eyJhbGciOiJub25lIn0.eyJjb3VudHJ5IjoiRmFudGFzeSIsImNpdHkiOiJTb21lb25lIiwibmFtZSI6IkphbWVzIERvZSIsImVtYWlsIjoiamFtZXMuZG9lQGV4YW1wbGUubG9jYWwiLCJzdWIiOiJzb21lIHNhbXBsZSBzdWJqZWN0IiwianRpIjoiYzA0Mjk0YTItZGY5MS00YWY2LWFlMDctZGYwOTk2ZjE0YTdmIiwiaWF0IjoxNjQ3MTkyNzQ5LCJleHAiOjE2NDcxOTYzNDl9.","eyJhbGciOiJub25lIn0.eyJjb3VudHJ5IjoiRmFudGFzeSIsImNpdHkiOiJTb21lb25lIiwibmFtZSI6IkFteSBEb2UiLCJlbWFpbCI6ImFteS5kb2VAZXhhbXBsZS5sb2NhbCIsInN1YiI6InNvbWUgc2FtcGxlIHN1YmplY3QiLCJqdGkiOiI5OGE4NmJiOC0xOTRjLTRjMjAtYTk1NS02ZWNmMjY2MzFhZWYiLCJpYXQiOjE2NDcxOTI3NjAsImV4cCI6MTY0NzE5NjM2MH0."]}
```

## example of POST request made using curl and its signed response

it begins with a first request

```shell
curl -i -X POST -H "Content-Type: application/json" -d '{"country":"Fantasy","city":"Someone","name":"James Doe","email":"james.doe@example.local","subject":"some sample subject"}' http://127.0.0.1:8080/outcome/signed
```

response:

```text
HTTP/1.1 200 OK
Content-Type: application/json
content-length: 650

{"signedStrings":["eyJhbGciOiJSUzI1NiJ9.eyJjb3VudHJ5IjoiRmFudGFzeSIsImNpdHkiOiJTb21lb25lIiwibmFtZSI6IkphbWVzIERvZSIsImVtYWlsIjoiamFtZXMuZG9lQGV4YW1wbGUubG9jYWwiLCJzdWIiOiJzb21lIHNhbXBsZSBzdWJqZWN0IiwianRpIjoiNTg3YjI0OTAtZTFlYi00ZTNkLTlhMDMtNmE4OGVhMWMxMDY1IiwiaWF0IjoxNjQ3MTk0NDYwLCJleHAiOjE2NDcxOTYyNjB9.gX4SjqZVO3OL-qsAay60-u0HmQ6OXsrV73_wF-5fi6CCT3RvjnkPJdGULOtXlHzYnnCicvaS2WLf6TiGXHs3ClAze-5zkQTIn1InbctDQYzg4AXliHE9O4fQhg2cwPb1r8e0BL7THwX6Th1rdA18KpwbChuWMlCrEU_2NXnfcW4uryOFdO6VS4NFfgM1F4w7uMzvPdXj_nEz0nomhYLGcQzGcc6yRDUjgNzMmb8C9SeJWsC6-yUET_4ZV05uWqKJqL6R2IeYi-UATgoCfZcIRZSIDRozn5NIdAlWG-GbJu69rB52jI5NGkBEOxjOoDWjzpRhbm9fEBYB6o345_teAQ"]}
```

and then a second request

```shell
curl -i -X POST -H "Content-Type: application/json" -d '{"country":"Fantasy","city":"Someone","name":"Amy Doe","email":"amy.doe@example.local","subject":"some sample subject"}' http://127.0.0.1:8080/outcome/signed
```

response:

```text
HTTP/1.1 200 OK
Content-Type: application/json
content-length: 1276

{"signedStrings":["eyJhbGciOiJSUzI1NiJ9.eyJjb3VudHJ5IjoiRmFudGFzeSIsImNpdHkiOiJTb21lb25lIiwibmFtZSI6IkphbWVzIERvZSIsImVtYWlsIjoiamFtZXMuZG9lQGV4YW1wbGUubG9jYWwiLCJzdWIiOiJzb21lIHNhbXBsZSBzdWJqZWN0IiwianRpIjoiNTg3YjI0OTAtZTFlYi00ZTNkLTlhMDMtNmE4OGVhMWMxMDY1IiwiaWF0IjoxNjQ3MTk0NDYwLCJleHAiOjE2NDcxOTYyNjB9.gX4SjqZVO3OL-qsAay60-u0HmQ6OXsrV73_wF-5fi6CCT3RvjnkPJdGULOtXlHzYnnCicvaS2WLf6TiGXHs3ClAze-5zkQTIn1InbctDQYzg4AXliHE9O4fQhg2cwPb1r8e0BL7THwX6Th1rdA18KpwbChuWMlCrEU_2NXnfcW4uryOFdO6VS4NFfgM1F4w7uMzvPdXj_nEz0nomhYLGcQzGcc6yRDUjgNzMmb8C9SeJWsC6-yUET_4ZV05uWqKJqL6R2IeYi-UATgoCfZcIRZSIDRozn5NIdAlWG-GbJu69rB52jI5NGkBEOxjOoDWjzpRhbm9fEBYB6o345_teAQ","eyJhbGciOiJSUzI1NiJ9.eyJjb3VudHJ5IjoiRmFudGFzeSIsImNpdHkiOiJTb21lb25lIiwibmFtZSI6IkFteSBEb2UiLCJlbWFpbCI6ImFteS5kb2VAZXhhbXBsZS5sb2NhbCIsInN1YiI6InNvbWUgc2FtcGxlIHN1YmplY3QiLCJqdGkiOiI3MzgzNWY4Mi05NjY2LTRjODgtYTYzZS0yY2UyZWY0MmVmMjkiLCJpYXQiOjE2NDcxOTQ1MzksImV4cCI6MTY0NzE5NjMzOX0.JQ_gun6248k0Is-154N--dUpwXsthDUzdPEovh7w845wKN3D4S_YyXsviWxVdL0ctJtowEspgg_hYkkOHCjbtNvNyCAMauLKGemvWStAQQstFG6f4t8JkkU6W8CZLLYL5--UEREO3gqvnmhzqv6PRWAHZK_BQhA4TLsO1o0DODRr0HkMuo1iwyZx409SM8up7uxAaRCqAQXbzg6Ya00Ps6D6ZbRgnFCvUg-Jn30Nju9Kn_iIe9FW97uxj9PGlRJBBkOjnr6zS-E-hhHzIgEyT2kjhLa0yafRlXQMHeKknPcHXK3G4AQMXKJ1cGHcpsNYSeqwkiXMxEGdbVBneBWHtg"]}
```
