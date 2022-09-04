package local.example.openapi;

import io.quarkus.test.junit.QuarkusTest;

import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import javax.ws.rs.core.MediaType;

import static io.restassured.RestAssured.given;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;

@QuarkusTest
@TestMethodOrder(OrderAnnotation.class)
public class SampleResourceTest {

    @Test
    @Order(1)
    public void readEndpointTest() {

        given()
          .when().get("/sample")
          .then().statusCode(HttpStatus.SC_OK).body(
                        "$.size()", is(6),
                        "name", containsInAnyOrder("one", "two", "three", "four", "five", "six"),
                        "definition", containsInAnyOrder("someone", "someone", "someone", "someone", "someone", "someone")
                );
    }

    @Test
    @Order(2)
    public void addEndpointTest() {

        given()
                .body("{\"name\":\"seven\",\"definition\":\"someone\"}")
                .header("Content-Type", MediaType.APPLICATION_JSON)
                .when().post("/sample").then().statusCode(HttpStatus.SC_OK).body(
                        "$.size()", is(7),
                        "name", containsInAnyOrder("one", "two", "three", "four", "five", "six", "seven"),
                        "definition", containsInAnyOrder("someone", "someone", "someone", "someone", "someone", "someone", "someone")
                );
    }

    @Test
    @Order(3)
    public void updateEndpointTest() {

        given()
                .body("{\"name\":\"seven\",\"definition\":\"something\"}")
                .header("Content-Type", MediaType.APPLICATION_JSON)
                .when().put("/sample").then().statusCode(HttpStatus.SC_OK).body(
                        "$.size()", is(7),
                        "name", containsInAnyOrder("one", "two", "three", "four", "five", "six", "seven"),
                        "definition", containsInAnyOrder("someone", "someone", "someone", "someone", "someone", "someone", "something")
                );
    }

    @Test
    @Order(4)
    public void deleteEndpointTest() {

        given()
                .body("{\"name\":\"seven\",\"definition\":\"something\"}")
                .header("Content-Type", MediaType.APPLICATION_JSON)
                .when().delete("/sample").then().statusCode(HttpStatus.SC_OK).body(
                        "$.size()", is(6),
                        "name", containsInAnyOrder("one", "two", "three", "four", "five", "six"),
                        "definition", containsInAnyOrder("someone", "someone", "someone", "someone", "someone", "someone")
                );
    }
}
