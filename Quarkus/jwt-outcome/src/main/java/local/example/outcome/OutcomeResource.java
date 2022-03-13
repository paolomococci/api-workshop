package local.example.outcome;

import local.example.outcome.model.UnsignedClaim;
import local.example.outcome.service.JwtOutcomeService;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

@Path("/outcome")
public class OutcomeResource {

    private final Set<UnsignedClaim> unsignedClaims = Collections.newSetFromMap(
        Collections.synchronizedMap(
                new LinkedHashMap<>()
        )
);

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String feedback() {
        return "--- jwt-outcome feedback ---";
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String unsignedJwt(UnsignedClaim unsignedClaim) {
        return JwtOutcomeService.createUnsignedJwtFromObject(unsignedClaim);
    }
}
