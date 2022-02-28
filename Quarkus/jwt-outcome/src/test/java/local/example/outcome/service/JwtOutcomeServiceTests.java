package local.example.outcome.service;

import io.quarkus.test.junit.QuarkusTest;

import local.example.outcome.model.UnsignedJsonWebToken;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

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
}
