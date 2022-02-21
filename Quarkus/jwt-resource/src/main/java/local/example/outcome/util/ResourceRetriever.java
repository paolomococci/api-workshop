package local.example.outcome.util;

import java.io.IOException;
import java.io.InputStream;

import java.nio.charset.StandardCharsets;

public class ResourceRetriever {

    public static String content(final String path)
            throws IOException {
        InputStream inputStream = ResourceRetriever
                .class.getClassLoader().getResourceAsStream(path);
        if (inputStream == null) {
            throw new IllegalArgumentException("Path " + path + " does not exist!");
        }
        return new String(
                inputStream.readAllBytes(),
                StandardCharsets.UTF_8
        );
    }
}
