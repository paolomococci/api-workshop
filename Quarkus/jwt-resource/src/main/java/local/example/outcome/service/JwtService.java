package local.example.outcome.service;

import local.example.outcome.util.ResourceRetriever;

import java.io.IOException;

public class JwtService {

    private final String key;

    public JwtService() throws IOException {
        String publicKey = ResourceRetriever.content("publickey.cer");
        key = publicKey
                .replace("-----BEGIN CERTIFICATE-----", "")
                .replace(System.lineSeparator(), "")
                .replace("-----END CERTIFICATE-----", "");
    }

    public static String create() {
        // TODO
        return "";
    }

    public static String decode() {
        // TODO
        return "";
    }

    public String getKey() {
        return key;
    }
}
