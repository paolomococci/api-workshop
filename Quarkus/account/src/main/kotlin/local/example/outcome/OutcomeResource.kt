package local.example.outcome

import local.example.outcome.model.Account

import java.util.*

import javax.ws.rs.GET
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.Consumes
import javax.ws.rs.PUT
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

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
    fun create() {

    }

    @GET
    @Path("/{accountNumber}")
    @Produces(MediaType.APPLICATION_JSON)
    fun read() {

    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun readAll() {

    }

    @PUT
    @Path("{accountNumber}/withdrawal")
    fun withdrawal() {

    }
}
