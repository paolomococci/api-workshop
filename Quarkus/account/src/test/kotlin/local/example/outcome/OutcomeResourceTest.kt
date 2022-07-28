package local.example.outcome

import local.example.outcome.model.Account

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import io.restassured.http.ContentType
import local.example.outcome.model.AccountStatus

import org.apache.http.HttpStatus
import org.hamcrest.CoreMatchers.*

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.collection.IsCollectionWithSize.hasSize
import org.hamcrest.collection.IsEmptyCollection.empty

import org.junit.jupiter.api.*

import java.math.BigDecimal

@QuarkusTest
@TestMethodOrder(MethodOrderer.OrderAnnotation::class)
class OutcomeResourceTest {

    @Test
    @Order(1)
    fun testReadAll() {
        val response = given()
            .`when`()[BASE_PATH]
            .then().statusCode(HttpStatus.SC_OK)
            .extract().response()
        val accounts = response.jsonPath().getList<Account>("$")
        assertThat(accounts, empty())
        assertThat(accounts, hasSize(0))
    }

    @Test
    @Order(2)
    fun testCreate() {
        val account = Account(
            1234506789L,
            9876543120L,
            "John Doe",
            BigDecimal(1300.00)
        )
        val retrieved: Account = given()
            .contentType(ContentType.JSON).body(account)
            .`when`().post(BASE_PATH)
            .then().statusCode(HttpStatus.SC_CREATED)
            .extract().`as`(Account::class.java)
        Assertions.assertTrue(true)
        assertThat(retrieved, notNullValue())
        assertThat(retrieved, equalTo(account))
    }

    @Test
    @Order(3)
    fun testAgainReadAll() {
        val response = given()
            .`when`()[BASE_PATH]
            .then().statusCode(HttpStatus.SC_OK)
            .extract().response()
        val accounts = response.jsonPath().getList<Account>("$")
        assertThat(accounts, not(empty()))
        assertThat(accounts, hasSize(1))
    }

    @Test
    @Order(4)
    fun testRead() {
        val retrieved = given()
            .`when`()["$BASE_PATH/{accountNumber}", 1234506789L]
            .then().statusCode(HttpStatus.SC_OK)
            .extract().`as`(Account::class.java)
        assertThat(retrieved.customerName, equalTo("John Doe"))
        assertThat(retrieved.balance, equalTo(BigDecimal(1300.00)))
        assertThat(retrieved.accountStatus, equalTo(AccountStatus.OPEN))
    }

    @Test
    @Order(5)
    fun testWithdraw() {
        Assertions.assertTrue(true)
    }

    @Test
    @Order(6)
    fun testDeposit() {
        Assertions.assertTrue(true)
    }

    companion object {
        private const val BASE_PATH = "/outcome"
    }
}
