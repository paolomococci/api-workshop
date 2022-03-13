package local.example.outcome;

import local.example.outcome.model.SignedClaim;
import local.example.outcome.model.Unsigned;
import local.example.outcome.model.UnsignedClaim;
import local.example.outcome.service.JwtOutcomeService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

@Path("/outcome")
public class OutcomeResource {

    private final Unsigned unsigned;

    public OutcomeResource() {
        unsigned = new Unsigned();
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String feedback() {
        return "--- jwt-outcome feedback ---";
    }

    @POST
    @Path("/unsigned")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Unsigned unsignedJwt(UnsignedClaim unsignedClaim) {
        unsigned.add(JwtOutcomeService.createUnsignedJwtFromObject(unsignedClaim));
        return unsigned;
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
