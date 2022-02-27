package local.example.outcome.service;

import io.quarkus.test.junit.QuarkusTest;

import local.example.outcome.model.SignedJsonWebToken;
import local.example.outcome.model.UnsignedJsonWebToken;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

@QuarkusTest
public class JwtOutcomeServiceTests {

    @Test
    public void sampleTest() {
        Assertions.assertTrue(true);
    }

    @Test
    public void createUnsignedJwtTokenFromPlainTest() {
        String jwtToken = JwtOutcomeService.createUnsignedJwtTokenFromPlain(
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
    public void createUnsignedJwtTokenFromObjectTest() {
        UnsignedJsonWebToken unsignedJsonWebToken = new UnsignedJsonWebToken(
                "Fantasy",
                "Someone",
                "James Doe",
                "james.doe@example.local",
                "some sample subject"
        );
        String jwtToken = JwtOutcomeService.createUnsignedJwtTokenFromObject(unsignedJsonWebToken);
        Assertions.assertTrue(jwtToken.getBytes(StandardCharsets.UTF_8).length > 0);
    }

    @Test
    public void createSignedJwtTokenFromObjectTest()
            throws NoSuchAlgorithmException, InvalidKeyException {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder(256);
        for (int i = 0; i < 256; i++) {
            int randomCharacter = 33 + (int) (random.nextDouble()*93);
            stringBuilder.append((char) randomCharacter);
        }
        SignedJsonWebToken signedJsonWebToken = new SignedJsonWebToken(
                "Fantasy",
                "Someone",
                "James Doe",
                "james.doe@example.local",
                "some sample subject",
                stringBuilder.toString(),
                "S0me0n9_5Am8le_k9y".getBytes(StandardCharsets.UTF_8)
        );
        String jwtToken = JwtOutcomeService.createSignedJwtTokenFromObject(signedJsonWebToken);
        System.out.println(jwtToken);
        Assertions.assertTrue(jwtToken.getBytes(StandardCharsets.UTF_8).length > 0);
    }
}
