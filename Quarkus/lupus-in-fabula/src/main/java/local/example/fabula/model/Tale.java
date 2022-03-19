package local.example.fabula.model;

import java.time.LocalDate;
import java.util.List;

public class Tale {

    public Integer id;
    public String title;
    public String description;
    public LocalDate release;
    public Author author;
    public Hero hero;
    public Antagonist antagonist;
    public List<Character> characters;
}
