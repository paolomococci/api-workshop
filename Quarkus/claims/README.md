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

eyJhbGciOiJSUzI1NiJ9.eyJjb3VudHJ5IjoiRmFudGFzeSIsImNpdHkiOiJTb21lb25lIiwibmFtZSI6IkphbWVzIERvZSIsImVtYWlsIjoiamFtZXMuZG9lQGV4YW1wbGUubG9jYWwiLCJzdWIiOiJzb21lIHNhbXBsZSBzdWJqZWN0IiwianRpIjoiZWVhODkwZTgtNTg2OS00NDFmLTg1YTUtMTBmYWVlZDkyNzZkIiwiaWF0IjoxNjQ3MjQxNzIzLCJleHAiOjE2NDcyNDM1MjN9.kW-aXupyESr_hYu-LYJQOo9Cb_GrBNqbdKa2f8f9nKyrOpVqyEKor8Rw-PCwOw3VE8d3uMeiAWRLiHEaP5pMIZkaFuJbSvnn9MPVEZkSadhYnCEV-NS21YuwV05jFyWDV-NAVC9_ZwVssDeVpftnHXaBMBwm_jrrX35wK2GgSPI4E7opTXBWCvfSWFpXtWCXMuc_zw68vWWyzp93YHVFtU-73DTNdMDSb4g1chq-pJgJ5ZawCaxxQKQCxbEg7ZcLgaKqDOlnj3o4nXA4RHurtXM86I8uJsSchM68rrUVjiy_O2qxSm-uP1hU85phxnuUqZz6ZoyVqn_ZPpeugV8MtQ
```

and then a second request

```shell
curl -i -X POST -H "Content-Type: application/json" -d '{"country":"Fantasy","city":"Someone","name":"Amy Doe","email":"amy.doe@example.local","subject":"some sample subject"}' http://127.0.0.1:8080/outcome/jwt
```

response:

```text

```

## example of GET request after some POST requests have been made

```shell
curl -i http://127.0.0.1:8080/outcome/jwt/list
```

response:

```text

```
