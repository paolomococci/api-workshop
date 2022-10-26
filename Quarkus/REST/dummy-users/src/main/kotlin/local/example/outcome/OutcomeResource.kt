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

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    fun create(user: User): Set<User?>? {
        users.add(user)
        return users
    }

    @GET
    @Path("/{uuid}")
    @Produces(MediaType.APPLICATION_JSON)
    fun read(@PathParam("uuid") uuid: String): User? {
        val response = users.stream().filter {
                account: User -> account.login.uuid == uuid
        }.findFirst()
        return response.orElseThrow {
            WebApplicationException(
                "There is no account with ID: $uuid",
                404
            )
        }
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun readAll(): Response? {
        return if (
            users.isEmpty()
        ) Response.ok().build() else Response.ok(users).build()
    }

    @PUT
    @Path("/{uuid}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    fun update(
        @PathParam("uuid") uuid: String,
        user: User
    ): Response? {
        val account = this.read(uuid) ?: throw WebApplicationException(
            "There is no account with ID: $uuid",
            404
        )
        account.name = user.name
        account.email = user.email
        account.phone = user.phone
        account.cell = user.cell
        account.picture = user.picture
        return Response.ok(account).build()
    }
}
