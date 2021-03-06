package local.example.outcome.service;

import io.quarkus.test.junit.QuarkusTest;

import local.example.outcome.model.SignedClaim;
import local.example.outcome.model.UnsignedClaim;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

@QuarkusTest
public class JwtOutcomeServiceTests {

    @Test
    public void sampleTest() {
        Assertions.assertTrue(true);
    }

    @Test
    public void createUnsignedJwtFromPlainTest() {
        String jwtToken = JwtOutcomeService.createUnsignedJwtFromPlain(
                "Fantasy",
                "Someone",
                "James Doe",
                "james.doe@example.local",
                "some sample subject"
        );
        System.out.println(jwtToken);
        Assertions.assertTrue(jwtToken.getBytes(StandardCharsets.UTF_8).length > 0);
    }

    @Test
    public void createUnsignedJwtFromObjectTest() {
        UnsignedClaim unsignedClaim = new UnsignedClaim(
                "Fantasy",
                "Someone",
                "James Doe",
                "james.doe@example.local",
                "some sample subject"
        );
        String jwtToken = JwtOutcomeService.createUnsignedJwtFromObject(unsignedClaim);
        Assertions.assertTrue(jwtToken.getBytes(StandardCharsets.UTF_8).length > 0);
    }

    @Test
    public void createSignedJwtFromObjectTest()
            throws NoSuchAlgorithmException,
            InvalidKeySpecException,
            IOException {
        SignedClaim signedClaim = new SignedClaim(
                "Fantasy",
                "Someone",
                "James Doe",
                "james.doe@example.local",
                "some sample subject"
        );
        JwtOutcomeService jwtOutcomeService = new JwtOutcomeService();
        String jwtToken = jwtOutcomeService.createSignedHMACJwtFromObject(signedClaim);
        Assertions.assertTrue(jwtToken.getBytes(StandardCharsets.UTF_8).length > 0);
    }
}
