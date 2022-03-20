package local.example.fabula.model;

import java.time.LocalDate;
import java.util.List;

public class Tale {

    public Integer id;
    public String title;
    public String description;
    public LocalDate release;
    public List<Author> authors;
    public List<Hero> heroes;
    public List<Antagonist> antagonists;
    public List<Character> characters;
}
