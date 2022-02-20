package local.example.outcome.util;

import java.io.InputStream;

public class ResourceRetriever {

    public InputStream retrieveStream(final String fileName) {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(fileName);
        if (inputStream == null) {
            throw new IllegalArgumentException(fileName + "not found");
        }
        return inputStream;
    }
}
