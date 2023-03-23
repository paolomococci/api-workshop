# dummy-accounts Project

## scaffolding

```shell
mvn io.quarkus.platform:quarkus-maven-plugin:2.16.5.Final:create -DprojectGroupId=local.example -DprojectArtifactId=dummy-accounts -DclassName="local.example.outcome.OutcomeResource" -Dpath="/outcome" -Dextensions="kotlin,resteasy-reactive-jackson" -DbuildTool=gradle
```

## Try

```shell
curl -i http://127.0.0.1:8090/outcome
```

and getting:

```text
HTTP/1.1 200 OK
Content-Type: application/json;charset=UTF-8
content-length: 2633

{"results":[{"gender":"","name":null,"location":null,"email":"","login":{"uuid":"58e279bb-9d3f-472c-97e7-151914e2e620","username":"","password":"","salt":"","md5":"","sha1":"","sha256":""},"dob":null,"registered":null,"phone":"","cell":"","id":null,"picture":null,"nat":""},{"gender":"","name":null,"location":null,"email":"","login":{"uuid":"2d3a8f17-3a83-45b2-9725-f24358319a34","username":"","password":"","salt":"","md5":"","sha1":"","sha256":""},"dob":null,"registered":null,"phone":"","cell":"","id":null,"picture":null,"nat":""},{"gender":"","name":null,"location":null,"email":"","login":{"uuid":"d42811f7-8470-4ab5-8117-9b779bc77bd3","username":"","password":"","salt":"","md5":"","sha1":"","sha256":""},"dob":null,"registered":null,"phone":"","cell":"","id":null,"picture":null,"nat":""},{"gender":"","name":null,"location":null,"email":"","login":{"uuid":"618c15ea-e410-457c-9d2f-8e70d0ef8c72","username":"","password":"","salt":"","md5":"","sha1":"","sha256":""},"dob":null,"registered":null,"phone":"","cell":"","id":null,"picture":null,"nat":""},{"gender":"","name":null,"location":null,"email":"","login":{"uuid":"2d7b30ae-da9d-4fac-aa85-66d61df2fde4","username":"","password":"","salt":"","md5":"","sha1":"","sha256":""},"dob":null,"registered":null,"phone":"","cell":"","id":null,"picture":null,"nat":""},{"gender":"","name":null,"location":null,"email":"","login":{"uuid":"9092194b-0fa2-4ef9-b687-e4537d2f905f","username":"","password":"","salt":"","md5":"","sha1":"","sha256":""},"dob":null,"registered":null,"phone":"","cell":"","id":null,"picture":null,"nat":""},{"gender":"","name":null,"location":null,"email":"","login":{"uuid":"97f00ec6-5068-46ce-83af-b6fe3edb2c57","username":"","password":"","salt":"","md5":"","sha1":"","sha256":""},"dob":null,"registered":null,"phone":"","cell":"","id":null,"picture":null,"nat":""},{"gender":"","name":null,"location":null,"email":"","login":{"uuid":"e944c6d6-2f6e-4f19-ba6f-e42528ec0065","username":"","password":"","salt":"","md5":"","sha1":"","sha256":""},"dob":null,"registered":null,"phone":"","cell":"","id":null,"picture":null,"nat":""},{"gender":"","name":null,"location":null,"email":"","login":{"uuid":"01a34b3c-a0a2-4f78-ae4e-1751358144c0","username":"","password":"","salt":"","md5":"","sha1":"","sha256":""},"dob":null,"registered":null,"phone":"","cell":"","id":null,"picture":null,"nat":""},{"gender":"","name":null,"location":null,"email":"","login":{"uuid":"9e97fe07-95fb-44c5-bbb0-54f87ebcc2df","username":"","password":"","salt":"","md5":"","sha1":"","sha256":""},"dob":null,"registered":null,"phone":"","cell":"","id":null,"picture":null,"nat":""}]}
```
