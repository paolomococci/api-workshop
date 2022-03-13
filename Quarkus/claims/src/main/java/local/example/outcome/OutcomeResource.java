package local.example.outcome;

import local.example.outcome.model.SignedClaim;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/outcome")
public class OutcomeResource {

    private final SignedClaim signed;

    public OutcomeResource() {
        signed = new SignedClaim();
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String feedback() {
        return "<!--feedback endpoint-->";
    }
}
