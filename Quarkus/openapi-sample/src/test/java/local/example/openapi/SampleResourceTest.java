package local.example.openapi;

import io.quarkus.test.junit.QuarkusTest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;

@QuarkusTest
public class SampleResourceTest {

    @Test
    public void readEndpointTest() {

        given()
          .when().get("/sample")
          .then().statusCode(200)
                .body(
                        "$.size()", is(6),
                        "name", containsInAnyOrder("one", "two", "three", "four", "five", "six")
                );
    }
}
