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

## example of GET request before POST requests are made

```shell
curl -i http://127.0.0.1:8080/outcome/jwt/list
```

response:

```text
HTTP/1.1 200 OK
content-length: 0
```

## example of POST request made using curl and its signed response

it begins with a first request

```shell
curl -i -X POST -H "Content-Type: application/json" -d '{"country":"Fantasy","city":"Someone","name":"James Doe","email":"james.doe@example.local","subject":"some sample subject"}' http://127.0.0.1:8080/outcome/jwt
```

response:

```text
HTTP/1.1 200 OK
Content-Type: application/json
content-length: 628

eyJhbGciOiJSUzI1NiJ9.eyJjb3VudHJ5IjoiRmFudGFzeSIsImNpdHkiOiJTb21lb25lIiwibmFtZSI6IkphbWVzIERvZSIsImVtYWlsIjoiamFtZXMuZG9lQGV4YW1wbGUubG9jYWwiLCJzdWIiOiJzb21lIHNhbXBsZSBzdWJqZWN0IiwianRpIjoiYzQ0NzRlODctZjI0My00YTg5LWFhYWMtNWIzNTRiMTM4ODI0IiwiaWF0IjoxNjQ3MjQyMDQ5LCJleHAiOjE2NDcyNDM4NDl9.BJxiS5Bws9FuzkZ-ZMYkuul-nmeACX7felWsgod5JnWWCDdT9Eo6tOpeZGm7Dmbb7pwpcYxQh9OKsA0Ed_BekggbWLSSF6JDNtE_kmFtOfKhU2RpGGyI98VaedpWJLezvJ4k4hKLkZHcU2qwMghhvQZWwcmunGiSPNqPlr0Q_7rf43aMN0JDCrsV-bjCzmvhdxdJvFYOhzHUpEthAw1q7mckk5anSz655ZARLGh2fVtLSOM7-Z0fRPh4AJiMNnbkuqmwyX05WxKp6AzWehNO4qEuB-COI_A07I2MTkK-KPdHzqy2VKj5Jbl8Dajcg6oXS6gNgQBld7R6hnHKp30B_Q
```

and then a second request

```shell
curl -i -X POST -H "Content-Type: application/json" -d '{"country":"Fantasy","city":"Someone","name":"Amy Doe","email":"amy.doe@example.local","subject":"some sample subject"}' http://127.0.0.1:8080/outcome/jwt
```

response:

```text
HTTP/1.1 200 OK
Content-Type: application/json
content-length: 623

eyJhbGciOiJSUzI1NiJ9.eyJjb3VudHJ5IjoiRmFudGFzeSIsImNpdHkiOiJTb21lb25lIiwibmFtZSI6IkFteSBEb2UiLCJlbWFpbCI6ImFteS5kb2VAZXhhbXBsZS5sb2NhbCIsInN1YiI6InNvbWUgc2FtcGxlIHN1YmplY3QiLCJqdGkiOiI0ZjUyNWIxMS02ZmFjLTQzNjYtYjM3Ny0yOTg3M2E1YjllZDkiLCJpYXQiOjE2NDcyNDE3OTcsImV4cCI6MTY0NzI0MzU5N30.Az_uUnj9Kon3VbCePAS8j-FyfPJzifHLlMZweovWJdBqMU1DAEY_hMxcV-U2oOt5cHkc0qG9QQiLrgT-3spgu7235F1_A3pVr6XkzW-SuKYN2kTPrb7x31jQGm4ZeAsYKz9gAOS5JN39mGwfxNhwG8NXiDoLk6mlVP8B_YpRCDY55-9AuJ40CuDpECsrELTAPZUH8Be2gZIGgX8FM4vNP98Y6lxjYnJnJ0KkL20d3W5v3aqDJ8ddfA_wCaXW1j2WPoHYneIx9d8rvCzIshUmx7Q8fByxoRFyp8_hnjn4SucngJodXdyDCQ6sUPpTKffESnvlT2ua59OaYBDuagYYKA
```

## example of GET request after some POST requests have been made

```shell
curl -i http://127.0.0.1:8080/outcome/jwt/list
```

response:

```text

```
