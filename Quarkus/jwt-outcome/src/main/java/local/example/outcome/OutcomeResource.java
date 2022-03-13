package local.example.outcome;

import local.example.outcome.model.SignedClaim;
import local.example.outcome.model.UnsignedClaim;
import local.example.outcome.service.JwtOutcomeService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

@Path("/outcome")
public class OutcomeResource {

    private final Set<String> unsignedClaims = Collections.newSetFromMap(
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
    public Set<String> unsignedJwt(UnsignedClaim unsignedClaim) {
        unsignedClaims.add(JwtOutcomeService.createUnsignedJwtFromObject(unsignedClaim));
        return unsignedClaims;
    }

    @POST
    @Path("/signed")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String signedJwt(SignedClaim signedClaim)
            throws IOException,
            NoSuchAlgorithmException,
            InvalidKeySpecException {
        JwtOutcomeService jwtOutcomeService = new JwtOutcomeService();
        return jwtOutcomeService.createSignedHMACJwtFromObject(signedClaim);
    }
}
