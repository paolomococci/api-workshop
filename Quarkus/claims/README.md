# claims

This Application could be defined as the essential version of jwt-outcome

## scaffolding

```shell
mvn io.quarkus.platform:quarkus-maven-plugin:2.9.0.Final:create -DprojectGroupId=local.example -DprojectArtifactId=claims -DclassName="local.example.outcome.OutcomeResource" -Dpath="/outcome" -Dextensions="resteasy-jackson"
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

eyJhbGciOiJSUzI1NiJ9.eyJjb3VudHJ5IjoiRmFudGFzeSIsImNpdHkiOiJTb21lb25lIiwibmFtZSI6IkFteSBEb2UiLCJlbWFpbCI6ImFteS5kb2VAZXhhbXBsZS5sb2NhbCIsInN1YiI6InNvbWUgc2FtcGxlIHN1YmplY3QiLCJqdGkiOiIxNWMyY2RhZC1lMmFmLTQyZjYtOTc2Ny01ODBhNzI2NTFjYzIiLCJpYXQiOjE2NDcyNDIxMTQsImV4cCI6MTY0NzI0MzkxNH0.ErUlWiRHBm4v2XaSzPaPb18AlY1V36_JYkvO8vzUhtva77jnt6nsWnkM6ttBL--5vGNsO-mO5brnyi0H3D6yo1dVXFxOAMFLy5CK2SIPBPxZMF0Vl5HpfF-n_I1fSUGK3d3e5XKTPa24-oHLS6tO0h2n3can3zDEA2cocPcaaI6-7KjuHQpfvYCqWi0abmUdJ8XnvBu38f07keZQs3bkNU0tK_7FuWSgYPqZ_5nafUggBJJA7BOFWxGnPoT-zDpmYpF-jLwknmemC-uwUtJWlasO7Pm2F5w_d1r_ixKW_cSdpGMPm_XsDofdtuBgvcGrb-BUbmE4uYiqxhlYum7QKQ
```

## example of GET request after some POST requests have been made

```shell
curl -i http://127.0.0.1:8080/outcome/jwt/list
```

response:

```text
HTTP/1.1 200 OK
Content-Type: application/json
content-length: 1290

{"signedStrings":["eyJhbGciOiJSUzI1NiJ9.eyJjb3VudHJ5IjoiRmFudGFzeSIsImNpdHkiOiJTb21lb25lIiwibmFtZSI6IkphbWVzIERvZSIsImVtYWlsIjoiamFtZXMuZG9lQGV4YW1wbGUubG9jYWwiLCJzdWIiOiJzb21lIHNhbXBsZSBzdWJqZWN0IiwianRpIjoiYzQ0NzRlODctZjI0My00YTg5LWFhYWMtNWIzNTRiMTM4ODI0IiwiaWF0IjoxNjQ3MjQyMDQ5LCJleHAiOjE2NDcyNDM4NDl9.BJxiS5Bws9FuzkZ-ZMYkuul-nmeACX7felWsgod5JnWWCDdT9Eo6tOpeZGm7Dmbb7pwpcYxQh9OKsA0Ed_BekggbWLSSF6JDNtE_kmFtOfKhU2RpGGyI98VaedpWJLezvJ4k4hKLkZHcU2qwMghhvQZWwcmunGiSPNqPlr0Q_7rf43aMN0JDCrsV-bjCzmvhdxdJvFYOhzHUpEthAw1q7mckk5anSz655ZARLGh2fVtLSOM7-Z0fRPh4AJiMNnbkuqmwyX05WxKp6AzWehNO4qEuB-COI_A07I2MTkK-KPdHzqy2VKj5Jbl8Dajcg6oXS6gNgQBld7R6hnHKp30B_Q","eyJhbGciOiJSUzI1NiJ9.eyJjb3VudHJ5IjoiRmFudGFzeSIsImNpdHkiOiJTb21lb25lIiwibmFtZSI6IkFteSBEb2UiLCJlbWFpbCI6ImFteS5kb2VAZXhhbXBsZS5sb2NhbCIsInN1YiI6InNvbWUgc2FtcGxlIHN1YmplY3QiLCJqdGkiOiIxNWMyY2RhZC1lMmFmLTQyZjYtOTc2Ny01ODBhNzI2NTFjYzIiLCJpYXQiOjE2NDcyNDIxMTQsImV4cCI6MTY0NzI0MzkxNH0.ErUlWiRHBm4v2XaSzPaPb18AlY1V36_JYkvO8vzUhtva77jnt6nsWnkM6ttBL--5vGNsO-mO5brnyi0H3D6yo1dVXFxOAMFLy5CK2SIPBPxZMF0Vl5HpfF-n_I1fSUGK3d3e5XKTPa24-oHLS6tO0h2n3can3zDEA2cocPcaaI6-7KjuHQpfvYCqWi0abmUdJ8XnvBu38f07keZQs3bkNU0tK_7FuWSgYPqZ_5nafUggBJJA7BOFWxGnPoT-zDpmYpF-jLwknmemC-uwUtJWlasO7Pm2F5w_d1r_ixKW_cSdpGMPm_XsDofdtuBgvcGrb-BUbmE4uYiqxhlYum7QKQ"],"empty":false}
```
