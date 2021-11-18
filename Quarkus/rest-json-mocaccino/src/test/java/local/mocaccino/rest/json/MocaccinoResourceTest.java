package local.mocaccino.rest.json;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class MocaccinoResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/mocaccino")
          .then()
             .statusCode(200)
             .body(is("mocaccino API at work!"));
    }
}
