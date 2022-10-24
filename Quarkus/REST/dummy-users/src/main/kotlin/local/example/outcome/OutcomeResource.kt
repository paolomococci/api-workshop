package local.example.outcome

import javax.ws.rs.*
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response

import local.example.outcome.model.User

import java.util.*

@Path("/outcome")
class OutcomeResource {

    private val users = Collections.newSetFromMap(
        Collections.synchronizedMap(
            LinkedHashMap<User, Boolean>()
        )
    )

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun read(): Response? {
        return Response.ok().build()
    }
}
