package local.example.outcome

import io.quarkus.test.junit.QuarkusTest

import io.restassured.http.ContentType
import io.restassured.RestAssured.given

import org.apache.http.HttpStatus

import org.hamcrest.CoreMatchers.`is`
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
            .body(`is`(JSON_OUTCOME))
    }

    companion object {
        private const val BASE_PATH = "/outcome"
        private const val JSON_DATA =
            "{\"login\":{\"uuid\":\"c066898d-828a-4af8-bc52-f3d1d06156d9\"},\"name\":{\"title\":\"\",\"first\":\"\",\"second\":\"\"},\"email\":\"\",\"phone\":\"\",\"cell\":\"\",\"picture\":{\"large\":\"\",\"medium\":\"\",\"thumbnail\":\"\"}}"
        private const val JSON_OUTCOME =
            "[{\"login\":{\"uuid\":\"c066898d-828a-4af8-bc52-f3d1d06156d9\"},\"name\":{\"title\":\"\",\"first\":\"\",\"second\":\"\"},\"email\":\"\",\"phone\":\"\",\"cell\":\"\",\"picture\":{\"large\":\"\",\"medium\":\"\",\"thumbnail\":\"\"}}]"
    }

}
