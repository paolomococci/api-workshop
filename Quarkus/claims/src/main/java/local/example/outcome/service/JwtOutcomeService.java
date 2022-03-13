package local.example.outcome.service;

import local.example.outcome.retriever.ResourceRetriever;

import java.io.IOException;
import java.io.InputStream;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.spec.PKCS8EncodedKeySpec;

public class JwtOutcomeService {

    private byte[] privateDerKey;

    public JwtOutcomeService(byte[] privateDerKey)
            throws IOException {
        InputStream privateInputStream = ResourceRetriever.raw("privateKey.der");
        privateDerKey = new byte[privateInputStream.available()];
        privateDerKey = privateInputStream.readAllBytes();
    }

    private PKCS8EncodedKeySpec pkcs8EncodedKeySpec() {
        return new PKCS8EncodedKeySpec(privateDerKey);
    }

    private KeyFactory keyFactory()
            throws NoSuchAlgorithmException {
        return KeyFactory.getInstance("RSA");
    }
}
