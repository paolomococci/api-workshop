package local.example.fabula.service;

import local.example.fabula.model.Antagonist;
import local.example.fabula.model.Author;
import local.example.fabula.model.Character;
import local.example.fabula.model.Hero;
import local.example.fabula.model.Tale;

import java.util.ArrayList;
import java.util.List;

public class DataStoreService {

    private final List<Tale> tales;
    private final List<Author> authors;
    private final List<Hero> heroes;
    private final List<Antagonist> antagonists;
    private final List<Character> characters;

    public DataStoreService() {
        this.tales = new ArrayList<>();
        this.authors = new ArrayList<>();
        this.heroes = new ArrayList<>();
        this.antagonists = new ArrayList<>();
        this.characters = new ArrayList<>();
    }

    public List<Tale> getTales() {
        return tales;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public List<Hero> getHeroes() {
        return heroes;
    }

    public void add(Hero hero) {
        this.heroes.add(hero);
    }

    public List<Antagonist> getAntagonists() {
        return antagonists;
    }

    public List<Character> getCharacters() {
        return characters;
    }

    public void add(Character character) {
        this.characters.add(character);
    }
}
