package local.example.outcome

import javax.ws.rs.*
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response

@Path("/outcome")
class OutcomeResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun read(): Response? {
        return Response.ok().build()
    }
}
