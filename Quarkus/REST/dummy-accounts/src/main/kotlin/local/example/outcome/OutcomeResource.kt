package local.example.outcome

import local.example.outcome.model.User
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response

@Path("/outcome")
class OutcomeResource {

    private val result = local.example.outcome.model.Result()

    init {
        for (i in 1..10) {
            this.result.results!!.add(User())
        }
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun readAll(): Response? {
        return if (
            result.results!!.isEmpty()
        ) Response.ok().build()
        else Response.ok(result).build()
    }
}