package local.example.outcome;

import local.example.outcome.model.SignedClaim;
import local.example.outcome.model.SignedJwtList;
import local.example.outcome.service.JwtOutcomeService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

@Path("/outcome")
public class OutcomeResource {

    private final SignedJwtList signedJwtList;

    public OutcomeResource() {
        signedJwtList = new SignedJwtList();
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String feedback() {
        return "<!--feedback endpoint-->";
    }

    @POST
    @Path("/jwt")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public SignedJwtList signedJwt(SignedClaim signedClaim)
            throws IOException,
            NoSuchAlgorithmException,
            InvalidKeySpecException {
        JwtOutcomeService jwtOutcomeService = new JwtOutcomeService();
        this.signedJwtList.add(jwtOutcomeService.createSignedHMACJwt(signedClaim));
        return this.signedJwtList;
    }
}
