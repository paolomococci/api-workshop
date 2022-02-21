package local.example.outcome.service;

import io.quarkus.test.junit.QuarkusTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

@QuarkusTest
public class JwtServiceTests {

    @Test
    public void cerExistenceTest() throws IOException {
        JwtService jwtService = new JwtService();
        String key = jwtService.getKey();
        Assertions.assertNotNull(key);
    }

    @Test
    @Disabled
    @DisplayName("create and decode JWT")
    public void jwtTest() {
        // TODO
    }
}
