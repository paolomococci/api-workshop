package local.example.outcome.service;

import io.jsonwebtoken.Jwts;

import local.example.outcome.model.SignedClaim;
import local.example.outcome.retriever.ResourceRetriever;

import java.io.IOException;
import java.io.InputStream;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.UUID;

public class JwtOutcomeService {

    private byte[] privateDerKey;

    public JwtOutcomeService(byte[] privateDerKey)
            throws IOException {
        InputStream privateInputStream = ResourceRetriever.raw("privateKey.der");
        privateDerKey = new byte[privateInputStream.available()];
        privateDerKey = privateInputStream.readAllBytes();
    }

    public String createSignedHMACJwt(SignedClaim signedClaim)
            throws NoSuchAlgorithmException,
            InvalidKeySpecException {
        return Jwts.builder()
                .claim("country", signedClaim.country)
                .claim("city", signedClaim.city)
                .claim("name", signedClaim.name)
                .claim("email", signedClaim.email)
                .setSubject(signedClaim.subject)
                .setId(UUID.randomUUID().toString())
                .setIssuedAt(Date.from(Instant.now()))
                .setExpiration(Date.from(Instant.now().plus(30, ChronoUnit.MINUTES)))
                .signWith(rsaPrivateKey())
                .compact();
    }

    private RSAPrivateKey rsaPrivateKey()
            throws NoSuchAlgorithmException,
            InvalidKeySpecException {
        return (RSAPrivateKey) keyFactory().generatePrivate(pkcs8EncodedKeySpec());
    }

    private PKCS8EncodedKeySpec pkcs8EncodedKeySpec() {
        return new PKCS8EncodedKeySpec(privateDerKey);
    }

    private KeyFactory keyFactory()
            throws NoSuchAlgorithmException {
        return KeyFactory.getInstance("RSA");
    }
}
