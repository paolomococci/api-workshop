package local.example.openapi;

import io.quarkus.test.junit.QuarkusTest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class SampleResourceTest {

    @Test
    public void readEndpointTest() {

        given()
          .when().get("/sample")
          .then()
             .statusCode(200);
    }
}
