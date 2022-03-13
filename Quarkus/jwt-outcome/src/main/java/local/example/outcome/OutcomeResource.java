package local.example.outcome;

import local.example.outcome.model.SignedClaim;
import local.example.outcome.model.UnsignedClaim;
import local.example.outcome.service.JwtOutcomeService;

import javax.ws.rs.*;
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

    private final Set<SignedClaim> signedClaims = Collections.newSetFromMap(
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
    @Path("/unsigned")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String unsignedJwt(UnsignedClaim unsignedClaim) {
        return JwtOutcomeService.createUnsignedJwtFromObject(unsignedClaim);
    }
}
