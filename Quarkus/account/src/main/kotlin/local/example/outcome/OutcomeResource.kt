package local.example.outcome

import local.example.outcome.model.Account

import java.util.*

import javax.ws.rs.GET
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.Consumes
import javax.ws.rs.DELETE
import javax.ws.rs.PATCH
import javax.ws.rs.PUT
import javax.ws.rs.Produces
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
    fun create(account: Account) {
        // TODO
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
