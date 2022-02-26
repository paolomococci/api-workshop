package local.example.outcome.service;

import io.quarkus.test.junit.QuarkusTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@QuarkusTest
public class JwtOutcomeServiceTests {

    @Test
    public void sampleTest() {
        Assertions.assertTrue(true);
    }

    @Test
    public void createSampleJwtTokenTest()
            throws IOException {
        String jwtToken = JwtOutcomeService.createUnsignedJwtToken(
                "Fantasy",
                "Someone",
                "James Doe",
                "james.doe@example.local",
                "some sample subject"
        );
        System.out.println(jwtToken);
        Assertions.assertTrue(jwtToken.getBytes(StandardCharsets.UTF_8).length > 0);
    }
}
