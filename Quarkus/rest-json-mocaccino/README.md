# rest-json-mocaccino

```shell
mvn io.quarkus.platform:quarkus-maven-plugin:2.6.3.Final:create \
    -DprojectGroupId=mocaccino \
    -DprojectArtifactId=rest-json-mocaccino \
    -DprojectVersion=0.0.1-SNAPSHOT \
    -DclassName="local.mocaccino.rest.json.MocaccinoResource" \
    -Dextensions="resteasy,resteasy-jackson" \
    -DbuildTool=gradle
```
