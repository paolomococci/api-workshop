package local.example.outcome.service;

import local.example.outcome.retriever.ResourceRetriever;

import java.io.IOException;
import java.io.InputStream;

public class JwtOutcomeService {

    private byte[] privateDerKey;

    public JwtOutcomeService(byte[] privateDerKey)
            throws IOException {
        InputStream privateInputStream = ResourceRetriever.raw("privateKey.der");
        privateDerKey = new byte[privateInputStream.available()];
        privateDerKey = privateInputStream.readAllBytes();
    }
}
