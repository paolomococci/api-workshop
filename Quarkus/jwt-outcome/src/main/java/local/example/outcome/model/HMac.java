package local.example.outcome.model;

import local.example.outcome.generator.HMacGenerator;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class HMac {

    String hMac;

    public HMac(String secret, byte[] key)
            throws NoSuchAlgorithmException, InvalidKeyException {
        this.hMac = HMacGenerator.generate(secret, key);
    }
}
