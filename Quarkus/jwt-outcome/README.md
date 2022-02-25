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

```shell
openssl genrsa -out private.pem 4096
```

```shell
openssl rsa -in private.pem -outfor PEM -pubout -out public.pem
```