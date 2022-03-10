package local.example.outcome.service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import local.example.outcome.model.SignedClaim;
import local.example.outcome.model.UnsignedClaim;
import local.example.outcome.retriever.ResourceRetriever;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

import java.io.IOException;
import java.io.InputStream;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.UUID;

public class JwtOutcomeService {

    private static String pemKey;
    private byte[] privateDerKey;
    private byte[] publicDerKey;

    public JwtOutcomeService()
            throws IOException {
        String tempPemKey = ResourceRetriever.content("privateKey.pem");
        pemKey = privateKeyToCompactString(tempPemKey);
        InputStream privateInputStream = ResourceRetriever.raw("privateKey.der");
        privateDerKey = new byte[privateInputStream.available()];
        privateDerKey = privateInputStream.readAllBytes();
        InputStream publicInputStream = ResourceRetriever.raw("publicKey.der");
        publicDerKey = new byte[publicInputStream.available()];
        publicDerKey = publicInputStream.readAllBytes();
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
        byte[] keyInBytes = DatatypeConverter.parseBase64Binary(getPemKey());
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
                .setSigningKey(DatatypeConverter.parseBase64Binary(getPemKey()))
                .parseClaimsJws(jwt).getBody();
    }

    public static String getPemKey() {
        return pemKey;
    }

    public byte[] getPrivateDerKey() {
        return privateDerKey;
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

    public static String createUnsignedJwtFromPlain(
            String country,
            String city,
            String name,
            String email,
            String subject
    ) {
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

    public static String createUnsignedJwtFromObject(UnsignedClaim unsignedClaim) {
        return Jwts.builder()
                .claim("country", unsignedClaim.country)
                .claim("city", unsignedClaim.city)
                .claim("name", unsignedClaim.name)
                .claim("email", unsignedClaim.email)
                .setSubject(unsignedClaim.subject)
                .setId(UUID.randomUUID().toString())
                .setIssuedAt(Date.from(Instant.now()))
                .setExpiration(Date.from(Instant.now().plus(60, ChronoUnit.MINUTES)))
                .compact();
    }

    public String createSignedHMACJwtFromObject(SignedClaim signedClaim)
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

    private RSAPublicKey rsaPublicKey()
            throws NoSuchAlgorithmException,
            InvalidKeySpecException {
        return (RSAPublicKey) keyFactory().generatePublic(x509EncodedKeySpec());
    }

    private PKCS8EncodedKeySpec pkcs8EncodedKeySpec() {
        return new PKCS8EncodedKeySpec(privateDerKey);
    }

    private X509EncodedKeySpec x509EncodedKeySpec() {
        return new X509EncodedKeySpec(publicDerKey);
    }

    private KeyFactory keyFactory()
            throws NoSuchAlgorithmException {
        return KeyFactory.getInstance("RSA");
    }
}
