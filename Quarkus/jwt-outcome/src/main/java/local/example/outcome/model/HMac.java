package local.example.outcome.model;

import local.example.outcome.generator.HMacGenerator;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

public class HMac
        implements Key {

    String hMac;

    public HMac(String secret, byte[] key)
            throws NoSuchAlgorithmException, InvalidKeyException {
        this.hMac = HMacGenerator.generate(secret, key);
    }

    @Override
    public String getAlgorithm() {
        // TODO
        return null;
    }

    @Override
    public String getFormat() {
        // TODO
        return null;
    }

    @Override
    public byte[] getEncoded() {
        // TODO
        return new byte[0];
    }
}
