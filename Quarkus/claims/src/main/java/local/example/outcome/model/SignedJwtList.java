package local.example.outcome.model;

import java.util.ArrayList;
import java.util.List;

public class SignedJwtList {

    public final List<String> signedStrings;

    public SignedJwtList() {
        signedStrings = new ArrayList<>();
    }

    public void add(String unsigned) {
        this.signedStrings.add(unsigned);
    }

    public boolean isEmpty() {
        return this.signedStrings.isEmpty();
    }
}
