package local.example.outcome

import local.example.outcome.model.Account

import java.util.*
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

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    fun create(account: Account): Response {
        if (account.customerName == null)
            throw WebApplicationException("Bad Request: the customer name was not specified", 400)
        return Response.status(201).entity(account).build()
    }

    @GET
    @Path("/{accountNumber}")
    @Produces(MediaType.APPLICATION_JSON)
    fun read() {
        // TODO
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun readAll(): Response? {
        return if (
            accounts.isEmpty()
        ) Response.ok().build() else Response.ok(accounts).build()
    }

    @PUT
    @Path("{accountNumber}/withdrawal")
    fun withdrawal() {
        // TODO
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
