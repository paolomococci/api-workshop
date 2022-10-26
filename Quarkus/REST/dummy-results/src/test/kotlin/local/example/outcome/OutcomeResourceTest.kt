package local.example.outcome

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import org.junit.jupiter.api.Test

@QuarkusTest
class OutcomeResourceTest {

    @Test
    fun testReadAllEndpoint() {
        given()
          .`when`().get("/outcome")
          .then()
             .statusCode(200)
    }
}
