package local.example.outcome;

import io.netty.handler.codec.http.HttpResponseStatus;
import io.quarkus.test.junit.QuarkusTest;

import io.restassured.http.ContentType;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class OutcomeResourceTest {

    private static String UNSIGNED = "";
    private static String SIGNED = "";

    @Test
    public void feedbackOutcomeEndpointTest() {
        given()
          .when().get("/outcome")
          .then()
             .statusCode(200)
             .body(is("--- jwt-outcome feedback ---"));
    }

    @Test
    public void unsignedEndpointTest() {
        given()
                .contentType(ContentType.TEXT)
                .body(UNSIGNED)
                .when().post("/outcome/unsigned")
                .then().statusCode(HttpResponseStatus.OK.code())
                .body(containsString("."));
    }

    @Test
    public void signedEndpointTest() {
        // TODO
    }
}
