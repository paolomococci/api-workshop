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

```

## example of POST request made using curl and its signed response

it begins with a first request

```shell

```

response:

```text

```

and then a second request

```shell

```

## example of GET request after some POST requests have been made

```shell

```

response:

```text

```
