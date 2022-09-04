package local.example.nimble;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class NimbleResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/nimble")
          .then()
             .statusCode(200)
             .body(is("Hello from nimble"));
    }
}
