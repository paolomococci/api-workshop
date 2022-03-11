# rest-json-mocaccino

```shell
mvn io.quarkus.platform:quarkus-maven-plugin:2.7.4.Final:create \
    -DprojectGroupId=mocaccino \
    -DprojectArtifactId=rest-json-mocaccino \
    -DprojectVersion=1.0.0-SNAPSHOT \
    -DclassName="local.mocaccino.rest.json.MocaccinoResource" \
    -Dextensions="resteasy,resteasy-jackson" \
    -DbuildTool=gradle
```
