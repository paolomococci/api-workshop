# billing

Example of REST application developed thanks to the Active Record pattern.

## scaffolding

```shell
mvn io.quarkus.platform:quarkus-maven-plugin:2.12.1.Final:create -DprojectGroupId=local.example -DprojectArtifactId=billing -DclassName="local.example.billing.BillingResource" -Dpath="/billing" -Dextensions="quarkus-resteasy-reactive,quarkus-resteasy-reactive-jackson,quarkus-reactive-routes,quarkus-reactive-pg-client,quarkus-hibernate-reactive-panache" -DbuildTool=gradle
```

## configurations

For the configurations I used the .env file, placed in the root directory of the project.
Writing the values as follows:

```text
HTTP_PORT=8080
DATASOURCE_USERNAME=someone
DATASOURCE_PASSWORD=something
```

Settings passed to file application.properties as follows:

```text
# HTTP port
quarkus.http.port=${HTTP_PORT}

# datasource settings

quarkus.datasource.db-kind=postgresql
quarkus.datasource.username=${DATASOURCE_USERNAME}
quarkus.datasource.password=${DATASOURCE_PASSWORD}
...
```

## running the application in development mode:

```shell
./gradlew quarkusDev
```
