package local.example.outcome.service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import local.example.outcome.util.ResourceRetrieverUtil;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Base64;
import java.util.Date;
import java.util.UUID;

public class JwtOutcomeService {

    private static String key;

    public JwtOutcomeService()
            throws IOException {
        String publicKey = ResourceRetrieverUtil.content("publicKey.pem");
        key = publicKeyToCompactString(publicKey);
    }

    public String create(
            String id,
            String issuer,
            String subject,
            long lifeTimeInMilliseconds
    ) {
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.ES256;
        long nowInMilliseconds = System.currentTimeMillis();
        Date date = new Date(nowInMilliseconds);
        byte[] keyInBytes = DatatypeConverter.parseBase64Binary(getKey());
        Key keyForSignature = new SecretKeySpec(keyInBytes, signatureAlgorithm.getJcaName());
        JwtBuilder jwtBuilder = Jwts.builder()
                .setId(id)
                .setIssuedAt(date)
                .setIssuer(issuer)
                .setSubject(subject)
                .signWith(signatureAlgorithm, keyForSignature);
        if (lifeTimeInMilliseconds >= 0) {
            long expirationInMilliseconds = nowInMilliseconds + lifeTimeInMilliseconds;
            Date expirationDate = new Date(expirationInMilliseconds);
            jwtBuilder.setExpiration(expirationDate);
        }
        return jwtBuilder.compact();
    }

    public Claims decode(String jwt) {
        return Jwts.parser()
                .setSigningKey(DatatypeConverter.parseBase64Binary(getKey()))
                .parseClaimsJws(jwt).getBody();
    }

    public String getKey() {
        return key;
    }

    private String publicKeyToCompactString(String publicKey) {
        return publicKey
                .replace("-----BEGIN CERTIFICATE-----", "")
                .replace(System.lineSeparator(), "")
                .replace("-----END CERTIFICATE-----", "");
    }

    private String privateKeyToCompactString(String privateKey) {
        return privateKey
                .replace("-----BEGIN RSA PRIVATE KEY-----", "")
                .replace(System.lineSeparator(), "")
                .replace("-----END RSA PRIVATE KEY-----", "");
    }

    public static String createSampleJwtToken(
            String country,
            String city,
            String name,
            String email,
            String subject
    ) throws IOException {
        return Jwts.builder()
                .claim("country", country)
                .claim("city", city)
                .claim("name", name)
                .claim("email", email)
                .setSubject(subject)
                .setId(UUID.randomUUID().toString())
                .setIssuedAt(Date.from(Instant.now()))
                .setExpiration(Date.from(Instant.now().plus(60, ChronoUnit.MINUTES)))
                .compact();
    }
}
