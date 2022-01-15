package local.example.nimble.api.resource;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ExpertiseResourceTests {

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/api/v1/expertise")
                .then()
                .statusCode(200)
                .body(is("expertise"));
    }
}
