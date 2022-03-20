package local.example.fabula.service;

import local.example.fabula.model.Antagonist;
import local.example.fabula.model.Author;
import local.example.fabula.model.Character;
import local.example.fabula.model.Hero;
import local.example.fabula.model.Tale;

import java.util.ArrayList;
import java.util.List;

public class TaleExamplesDataStoreService {

    private List<Tale> tales;
    private List<Author> authors;
    private List<Hero> heroes;
    private List<Antagonist> antagonists;
    private List<Character> characters;

    public TaleExamplesDataStoreService() {
        this.tales = new ArrayList<>();
        this.authors = new ArrayList<>();
        this.heroes = new ArrayList<>();
        this.antagonists = new ArrayList<>();
        this.characters = new ArrayList<>();
    }
}
