package local.example.outcome.generator;

import io.quarkus.test.junit.QuarkusTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

@QuarkusTest
public class HMacGeneratorTests {

    @Test
    public void generatorTest()
            throws NoSuchAlgorithmException, InvalidKeyException {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder(256);
        for (int i = 0; i < 256; i++) {
            int randomCharacter = 33 + (int) (random.nextDouble()*93);
            stringBuilder.append((char) randomCharacter);
        }
        HMacGenerator hMacGenerator = new HMacGenerator();
        String result = hMacGenerator.generate(
                stringBuilder.toString(),
                "sample".getBytes(StandardCharsets.UTF_8)
        );
        //System.out.println(result);
        Assertions.assertTrue(result.chars().count() > 0);
    }
}
