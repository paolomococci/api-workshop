package local.example.outcome.service;

import io.quarkus.test.junit.QuarkusTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.security.SignatureException;

@QuarkusTest
public class JwtServiceTests {

    @Test
    public void cerExistenceTest()
            throws IOException {
        JwtService jwtService = new JwtService();
        String key = jwtService.getKey();
        Assertions.assertNotNull(key);
    }

    @Test
    public void jwtCreateTest()
            throws SignatureException, IOException {
        JwtService jwtService = new JwtService();
        String jwt = jwtService.create(
                "SOMEONEID9876543210",
                "sampleJWT",
                "johndoe",
                300000
        );
        Assertions.assertNotNull(jwt);
    }
}
