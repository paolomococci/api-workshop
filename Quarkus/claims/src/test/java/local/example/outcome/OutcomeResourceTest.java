package local.example.outcome;

import io.netty.handler.codec.http.HttpResponseStatus;
import io.quarkus.test.junit.QuarkusTest;

import io.restassured.http.ContentType;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class OutcomeResourceTest {

    private static final String JSON_STRING = "{\"country\":\"Fantasy\",\"city\":\"Someone\",\"name\":\"James Doe\",\"email\":\"james.doe@example.local\",\"subject\":\"some sample subject\"}";

    @Test
    public void feedbackEndpointTest() {
        given()
          .when().get("/outcome")
          .then()
             .statusCode(200)
             .body(is("<!--feedback endpoint-->"));
    }

    @Test
    public void signedEndpointTest() {
        given()
                .contentType(ContentType.JSON)
                .body(JSON_STRING)
                .when().post("/outcome/jwt")
                .then().statusCode(HttpResponseStatus.OK.code());
    }
}
