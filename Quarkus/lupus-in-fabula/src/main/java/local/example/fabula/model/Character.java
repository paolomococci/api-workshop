package local.example.fabula.model;

import java.util.UUID;

public class Character {

    public String id;
    public String name;
    public Role role;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setId() {
        this.id = UUID.randomUUID().toString();
    }
}
