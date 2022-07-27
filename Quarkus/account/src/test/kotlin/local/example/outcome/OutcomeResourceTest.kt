package local.example.outcome

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured
import io.restassured.RestAssured.given
import local.example.outcome.model.Account
import org.apache.http.HttpStatus

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert
import org.hamcrest.collection.IsCollectionWithSize
import org.hamcrest.collection.IsEmptyCollection
import org.junit.jupiter.api.*

@QuarkusTest
@TestMethodOrder(MethodOrderer.OrderAnnotation::class)
class OutcomeResourceTest {

    @Test
    @Order(1)
    fun testReadAll() {
        val response = RestAssured.given()
            .`when`()[BASE_PATH]
            .then().statusCode(HttpStatus.SC_OK)
            .extract().response()
        val accounts = response.jsonPath().getList<Account>("$")
        MatcherAssert.assertThat(accounts, IsEmptyCollection.empty())
        MatcherAssert.assertThat(accounts, IsCollectionWithSize.hasSize(0))
    }

    @Test
    @Order(2)
    fun testCreate() {
        Assertions.assertTrue(true)
    }

    @Test
    @Order(3)
    fun testRead() {
        Assertions.assertTrue(true)
    }

    @Test
    @Order(4)
    fun testWithdraw() {
        Assertions.assertTrue(true)
    }

    companion object {
        private const val BASE_PATH = "/outcome"
    }
}
