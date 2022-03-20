package local.example.fabula.service;

import local.example.fabula.model.Antagonist;
import local.example.fabula.model.Author;
import local.example.fabula.model.Character;
import local.example.fabula.model.Hero;
import local.example.fabula.model.Tale;

import java.util.ArrayList;
import java.util.List;

public class TaleExamplesDataStoreService {

    private final List<Tale> tales;
    private final List<Author> authors;
    private final List<Hero> heroes;
    private final List<Antagonist> antagonists;
    private final List<Character> characters;

    public TaleExamplesDataStoreService() {
        this.tales = new ArrayList<>();
        this.authors = new ArrayList<>();
        this.heroes = new ArrayList<>();
        this.antagonists = new ArrayList<>();
        this.characters = new ArrayList<>();
    }
}
