# nimble

Example of REST application developed thanks to the Active Record pattern.

## scaffolding

```shell
mvn io.quarkus.platform:quarkus-maven-plugin:2.10.1.Final:create -DprojectGroupId=local.example -DprojectArtifactId=nimble -DclassName="local.example.nimble.NimbleResource" -Dpath="/nimble" -Dextensions="resteasy-jackson"
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

## development

```shell
./mvnw compile quarkus:dev
```
