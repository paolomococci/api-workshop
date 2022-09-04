package local.example.billing;

import io.quarkus.test.junit.QuarkusTest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class BillingResourceTest {

    @Test
    public void feedbackEndpointTest() {
        given()
          .when().get("/billing")
          .then()
             .statusCode(200)
             .body(is("-- Billing REST API feedback that returns some plain text --"));
    }
}
