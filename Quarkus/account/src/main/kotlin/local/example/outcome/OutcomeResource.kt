package local.example.outcome

import local.example.outcome.model.Account

import java.util.*

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/outcome")
class OutcomeResource {

    private val accounts = Collections.newSetFromMap(
        Collections.synchronizedMap(
            LinkedHashMap<Account, Boolean>()
        )
    )

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun readAll() {

    }
}
