package local.example.outcome

import io.quarkus.test.junit.QuarkusTest

import io.restassured.http.ContentType
import io.restassured.RestAssured.given

import org.apache.http.HttpStatus
import org.hamcrest.CoreMatchers.equalTo

import org.junit.jupiter.api.Test

@QuarkusTest
class OutcomeResourceTest {

    @Test
    fun testReadAllEndpoint() {
        given()
          .`when`().get(BASE_PATH)
          .then().statusCode(HttpStatus.SC_OK)
    }

    @Test
    fun testCreateEndpoint() {
        given().contentType(ContentType.JSON)
            .body(JSON_DATA).`when`().post(BASE_PATH)
            .then().statusCode(HttpStatus.SC_OK)
            .body("email[0]", equalTo("john.doe@example.local"))
    }

    companion object {
        private const val BASE_PATH = "/outcome"
        private const val JSON_DATA =
            "{\"name\":{\"title\":\"developer\",\"first\":\"John\",\"second\":\"Doe\"},\"email\":\"john.doe@example.local\",\"phone\":\"032165497\",\"cell\":\"3210456789\",\"picture\":{\"large\":\"\",\"medium\":\"\",\"thumbnail\":\"\"}}"
    }
}
