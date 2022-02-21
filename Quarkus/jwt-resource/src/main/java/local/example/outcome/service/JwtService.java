package local.example.outcome.service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import local.example.outcome.util.ResourceRetriever;

import javax.xml.bind.DatatypeConverter;
import java.io.IOException;

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
        // TODO
        return "";
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
