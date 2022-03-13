package local.example.outcome.service;

public class JwtOutcomeService {

    private byte[] privateDerKey;

    public JwtOutcomeService(byte[] privateDerKey) {
        this.privateDerKey = privateDerKey;
    }
}
