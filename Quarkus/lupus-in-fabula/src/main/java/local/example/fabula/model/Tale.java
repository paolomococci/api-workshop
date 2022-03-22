package local.example.fabula.model;

import java.time.LocalDate;
import java.util.List;

public class Tale {

    public String id;
    public String title;
    public String description;
    public LocalDate release;
    public List<Author> authors;
    public List<Hero> heroes;
    public List<Antagonist> antagonists;
    public List<Character> characters;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
