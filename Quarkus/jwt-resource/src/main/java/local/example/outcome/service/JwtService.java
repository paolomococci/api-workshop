package local.example.outcome.service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import local.example.outcome.util.ResourceRetriever;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

import java.io.IOException;
import java.util.Date;

public class JwtService {

    private static String key;

    public JwtService() throws IOException {
        String publicKey = ResourceRetriever.content("publickey.cer");
        key = publicKey
                .replace("-----BEGIN CERTIFICATE-----", "")
                .replace(System.lineSeparator(), "")
                .replace("-----END CERTIFICATE-----", "");
    }

    public static String create(
            String id,
            String issuer,
            String subject,
            long lifeTimeInMilliseconds
    ) {
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.ES256;
        long nowInMilliseconds = System.currentTimeMillis();
        JwtBuilder jwtBuilder = Jwts.builder()
                .setId(id)
                .setIssuedAt(new Date(nowInMilliseconds))
                .setIssuer(issuer)
                .setSubject(subject)
                .signWith(
                        signatureAlgorithm,
                        new SecretKeySpec(
                                DatatypeConverter.parseBase64Binary(key),
                                signatureAlgorithm.getJcaName()
                        )
                );
        if (lifeTimeInMilliseconds >= 0) {
            Date expirationDate = new Date(nowInMilliseconds + lifeTimeInMilliseconds);
            jwtBuilder.setExpiration(expirationDate);
        }
        return jwtBuilder.compact();
    }

    public static Claims decode(String jwt) {
        return Jwts.parser()
                .setSigningKey(DatatypeConverter.parseBase64Binary(key))
                .parseClaimsJws(jwt).getBody();
    }

    public String getKey() {
        return key;
    }
}
