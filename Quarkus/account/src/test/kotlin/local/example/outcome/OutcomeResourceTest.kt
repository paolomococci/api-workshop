package local.example.outcome

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import io.restassured.http.ContentType
import io.smallrye.common.constraint.Assert.assertTrue
import local.example.outcome.model.Account
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
            .`when`()[BASE_PATH].then().extract().response()
        assertTrue(response.statusCode == HttpStatus.SC_OK)
    }

    @Test
    @Order(2)
    fun testCreate() {
        val account = Account(
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
        val accounts = response.body.jsonPath().getList<Account>("$")
        assertThat(accounts, not(empty()))
        assertThat(accounts, hasSize(1))
    }

    @Test
    @Order(4)
    fun testRead() {
        val response = given()
            .`when`()[BASE_PATH]
            .then().statusCode(HttpStatus.SC_OK)
            .extract().response()
        val accounts = response.body.jsonPath().getList<Account>("$")
        val account: String = accounts.toString().substring(1, accounts.toString().length-1)
        val accountNumber: String = account.substring(15, 51)
        val retrieved = given()
            .`when`()["$BASE_PATH/{accountNumber}", accountNumber]
            .then().statusCode(HttpStatus.SC_OK)
            .extract().`as`(Account::class.java)
        assertThat(retrieved.customerName, equalTo("John Doe"))
        assertThat(retrieved.balance, equalTo(BigDecimal(1300.00)))
        assertThat(retrieved.accountStatus, equalTo(AccountStatus.OPEN))
    }

    @Test
    @Order(5)
    @Disabled
    fun testWithdraw() {
        val response = given()
            .`when`()[BASE_PATH]
            .then().statusCode(HttpStatus.SC_OK)
            .extract().response()
        val accounts = response.body.jsonPath().getList<Account>("$")
        val account: String = accounts.toString().substring(1, accounts.toString().length-1)
        val accountNumber: String = account.substring(15, 51)
        val retrieved = given()
            .body(6.65).`when`().put(
                "$BASE_PATH/{accountNumber}/withdrawal",
                accountNumber
            )
            .then().statusCode(HttpStatus.SC_OK)
            .extract().`as`(Account::class.java)
        assertThat(
            retrieved.balance,
            equalTo(BigDecimal(1300.00).subtract(BigDecimal(6.65)))
        )
    }

    @Test
    @Order(6)
    @Disabled
    fun testDeposit() {
        val retrievedBeforeTheOperation = given()
            .`when`()["$BASE_PATH/{accountNumber}", 1234506789L]
            .then().statusCode(HttpStatus.SC_OK)
            .extract().`as`(Account::class.java)

        val retrieved = given()
            .body(10.25).`when`().put(
                "$BASE_PATH/{accountNumber}/deposit",
                1234506789L
            )
            .then().statusCode(HttpStatus.SC_OK)
            .extract().`as`(Account::class.java)
        assertThat(
            retrieved.balance,
            equalTo(
                retrievedBeforeTheOperation.balance?.add(BigDecimal(10.25))
            )
        )
    }

    companion object {
        private const val BASE_PATH = "/outcome"
    }
}
