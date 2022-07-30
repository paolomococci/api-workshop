package local.example.outcome

import local.example.outcome.model.Account
import java.math.BigDecimal
import java.util.*
import java.util.function.Supplier
import javax.ws.rs.*
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response


@Path("/outcome")
class OutcomeResource {

    private val accounts = Collections.newSetFromMap(
        Collections.synchronizedMap(
            LinkedHashMap<Account, Boolean>()
        )
    )

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun readAll(): Response? {
        return if (
            accounts.isEmpty()
        ) Response.ok().build() else Response.ok(accounts).build()
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    fun create(account: Account): Response {
        if (account.customerName == null)
            throw WebApplicationException("Bad Request: the customer name was not specified", 400)
        accounts.add(account)
        return Response.status(201).entity(account).build()
    }

    @GET
    @Path("/{accountNumber}")
    @Produces(MediaType.APPLICATION_JSON)
    fun read(@PathParam("accountNumber") accountNumber: String): Account? {
        val response = accounts.stream().filter {
                account: Account -> account.accountNumber == accountNumber
        }.findFirst()
        return response.orElseThrow {
            WebApplicationException(
                "There is no account with ID: $accountNumber",
                404
            )
        }
    }

    @PUT
    @Path("{accountNumber}/withdrawal")
    fun withdrawal(
        @PathParam("accountNumber") accountNumber: String,
        amount: String
    ): Response? {
        val account = this.read(accountNumber)
        account?.withdrawFunds(BigDecimal(amount))
        return Response.ok(account).build()
    }

    @PUT
    @Path("{accountNumber}/deposit")
    fun deposit() {
        // TODO
    }

    @PATCH
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    fun update() {
        // TODO
    }

    @DELETE
    @Path("{accountNumber}")
    fun delete() {
        // TODO
    }
}
