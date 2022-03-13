package local.example.outcome.model;

import java.util.ArrayList;
import java.util.List;

public class Unsigned {

    public final List<String> unsignedStrings;

    public Unsigned() {
        unsignedStrings = new ArrayList<>();
    }

    public void add(String unsigned) {
        this.unsignedStrings.add(unsigned);
    }
}
