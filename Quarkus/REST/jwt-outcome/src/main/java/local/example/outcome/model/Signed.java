package local.example.outcome.model;

import java.util.ArrayList;
import java.util.List;

public class Signed {

    public final List<String> signedStrings;

    public Signed() {
        signedStrings = new ArrayList<>();
    }

    public void add(String unsigned) {
        this.signedStrings.add(unsigned);
    }
}
