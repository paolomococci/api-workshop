package local.example.outcome.model;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class SignedJsonWebToken {

    public String country;
    public String city;
    public String name;
    public String email;
    public String subject;
    public HMac hMac;

    public SignedJsonWebToken(
            String country,
            String city,
            String name,
            String email,
            String subject,
            String secret,
            byte[] key
    ) throws NoSuchAlgorithmException, InvalidKeyException {
        this.country = country;
        this.city = city;
        this.name = name;
        this.email = email;
        this.subject = subject;
        this.hMac = new HMac(secret, key);
    }
}
