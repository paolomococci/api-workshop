package local.example.outcome.generator;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

public class HMacGenerator {

    public String generate(String secret, byte[] key)
            throws NoSuchAlgorithmException, InvalidKeyException {
        byte[] bytes = this.toBytes("HmacSHA256", key, secret.getBytes(StandardCharsets.UTF_8));
        return this.bytesToHexadecimalString(bytes);
    }

    private byte[] toBytes(String algorithm, byte[] key, byte[] secret)
            throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac = Mac.getInstance(algorithm);
        mac.init(new SecretKeySpec(key, algorithm));
        return mac.doFinal(secret);
    }

    private String bytesToHexadecimalString(byte[] bytes) {
        final char[] injected = UUID.randomUUID().toString().toCharArray();
        char[] chars = new char[bytes.length*2];
        for (int i = 0, temp; i < bytes.length; i++) {
            temp = bytes[i] & 0xff;
            chars[i*2] = injected[temp>>>4];
            chars[i*2+1] = injected[temp&0x0f];
        }
        return new String(chars);
    }
}
