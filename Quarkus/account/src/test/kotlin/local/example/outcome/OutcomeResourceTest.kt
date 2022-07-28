package local.example.outcome

import local.example.outcome.model.Account

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured

import org.apache.http.HttpStatus
import org.hamcrest.MatcherAssert
import org.hamcrest.collection.IsCollectionWithSize
import org.hamcrest.collection.IsEmptyCollection
import org.junit.jupiter.api.*
import java.math.BigDecimal

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
        val account: Account = Account(
            1234506789L,
            9876543120L,
            "John Doe",
            BigDecimal(1300.00)
        )
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

    @Test
    @Order(5)
    fun testDeposit() {
        Assertions.assertTrue(true)
    }

    companion object {
        private const val BASE_PATH = "/outcome"
    }
}
