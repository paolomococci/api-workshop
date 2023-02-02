# dummy-results Project

## scaffolding

```shell
mvn io.quarkus.platform:quarkus-maven-plugin:2.16.1.Final:create -DprojectGroupId=local.example -DprojectArtifactId=dummy-results -DclassName="local.example.outcome.OutcomeResource" -Dpath="/outcome" -Dextensions="kotlin,resteasy-reactive-jackson" -DbuildTool=gradle
```

## Try

```shell
curl -i http://127.0.0.1:8090/outcome
HTTP/1.1 200 OK
Content-Type: application/json;charset=UTF-8
content-length: 2631

{"users":[{"gender":"","name":null,"location":null,"email":"","login":{"uuid":"97b02ae9-2ee1-4516-ada4-8027d9239a4e","username":"","password":"","salt":"","md5":"","sha1":"","sha256":""},"dob":null,"registered":null,"phone":"","cell":"","id":null,"picture":null,"nat":""},{"gender":"","name":null,"location":null,"email":"","login":{"uuid":"fdcecdb9-fc27-4069-bcb8-fdd2284bf1b4","username":"","password":"","salt":"","md5":"","sha1":"","sha256":""},"dob":null,"registered":null,"phone":"","cell":"","id":null,"picture":null,"nat":""},{"gender":"","name":null,"location":null,"email":"","login":{"uuid":"1f4b61a0-8ebf-49e9-964d-287ef47976e1","username":"","password":"","salt":"","md5":"","sha1":"","sha256":""},"dob":null,"registered":null,"phone":"","cell":"","id":null,"picture":null,"nat":""},{"gender":"","name":null,"location":null,"email":"","login":{"uuid":"9066aff8-c4fc-4f2d-ba7f-bc7702b7830d","username":"","password":"","salt":"","md5":"","sha1":"","sha256":""},"dob":null,"registered":null,"phone":"","cell":"","id":null,"picture":null,"nat":""},{"gender":"","name":null,"location":null,"email":"","login":{"uuid":"4a6ceab3-1f20-4c2b-8488-9c097e91f2cf","username":"","password":"","salt":"","md5":"","sha1":"","sha256":""},"dob":null,"registered":null,"phone":"","cell":"","id":null,"picture":null,"nat":""},{"gender":"","name":null,"location":null,"email":"","login":{"uuid":"bbe19700-b1d2-43f0-a1c9-5742c2df0d4f","username":"","password":"","salt":"","md5":"","sha1":"","sha256":""},"dob":null,"registered":null,"phone":"","cell":"","id":null,"picture":null,"nat":""},{"gender":"","name":null,"location":null,"email":"","login":{"uuid":"fb143f79-2066-49e5-908f-8cfcb80334cf","username":"","password":"","salt":"","md5":"","sha1":"","sha256":""},"dob":null,"registered":null,"phone":"","cell":"","id":null,"picture":null,"nat":""},{"gender":"","name":null,"location":null,"email":"","login":{"uuid":"034967e7-4274-4261-9bba-617dda5a2bb0","username":"","password":"","salt":"","md5":"","sha1":"","sha256":""},"dob":null,"registered":null,"phone":"","cell":"","id":null,"picture":null,"nat":""},{"gender":"","name":null,"location":null,"email":"","login":{"uuid":"745268cc-aaaa-4a7c-8fb2-483178cf4794","username":"","password":"","salt":"","md5":"","sha1":"","sha256":""},"dob":null,"registered":null,"phone":"","cell":"","id":null,"picture":null,"nat":""},{"gender":"","name":null,"location":null,"email":"","login":{"uuid":"4f863963-87d6-48b9-bf2e-ef771d9ff1a0","username":"","password":"","salt":"","md5":"","sha1":"","sha256":""},"dob":null,"registered":null,"phone":"","cell":"","id":null,"picture":null,"nat":""}]}
```
