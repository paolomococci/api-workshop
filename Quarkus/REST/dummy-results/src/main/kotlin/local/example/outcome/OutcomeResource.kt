package local.example.outcome

import local.example.outcome.model.Account
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response

@Path("/outcome")
class OutcomeResource {

    private val account: Account = Account()

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun readAll(): Response? {
        return if (
            account.users!!.isEmpty()
        ) Response.ok().build()
        else Response.ok(account).build()
    }
}
