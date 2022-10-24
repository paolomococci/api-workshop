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
    fun readAll(): Response? {
        return if (
            users.isEmpty()
        ) Response.ok().build() else Response.ok(users).build()
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    fun create(user: User): Set<User?>? {
        users.add(user)
        return users
    }
}
