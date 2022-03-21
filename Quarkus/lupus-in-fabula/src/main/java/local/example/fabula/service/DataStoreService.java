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

    public void add(Tale tale) {
        this.tales.add(tale);
    }

    public void removeTale(int index) {
        this.tales.remove(index);
    }

    public Tale getTale(int index) {
        return this.tales.get(index);
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void add(Author author) {
        this.authors.add(author);
    }

    public void removeAuthor(int index) {
        this.authors.remove(index);
    }

    public Author getAuthor(int index) {
        return this.authors.get(index);
    }

    public List<Hero> getHeroes() {
        return heroes;
    }

    public void add(Hero hero) {
        this.heroes.add(hero);
    }

    public void removeHero(int index) {
        this.heroes.remove(index);
    }

    public Hero getHero(int index) {
        return this.heroes.get(index);
    }

    public List<Antagonist> getAntagonists() {
        return antagonists;
    }

    public void add(Antagonist antagonist) {
        this.antagonists.add(antagonist);
    }

    public void removeAntagonist(int index) {
        this.antagonists.remove(index);
    }

    public Antagonist getAntagonist(int index) {
        return this.antagonists.get(index);
    }

    public List<Character> getCharacters() {
        return characters;
    }

    public void add(Character character) {
        this.characters.add(character);
    }

    public void removeCharacter(int index) {
        this.characters.remove(index);
    }

    public Character getCharacter(int index) {
        return this.characters.get(index);
    }
}
