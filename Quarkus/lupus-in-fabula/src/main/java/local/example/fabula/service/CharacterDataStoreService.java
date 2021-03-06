package local.example.fabula.service;

import local.example.fabula.model.Character;

import javax.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class CharacterDataStoreService {

    private final List<Character> characters;

    public CharacterDataStoreService() {
        characters = new ArrayList<>();
    }

    public List<Character> getCharacters() {
        return characters;
    }

    public void add(Character character) {
        this.characters.add(character);
    }

    public void remove(int index) {
        this.characters.remove(index);
    }

    public Character get(int index) {
        return this.characters.get(index);
    }

    public int size() {
        return this.characters.size();
    }
}
