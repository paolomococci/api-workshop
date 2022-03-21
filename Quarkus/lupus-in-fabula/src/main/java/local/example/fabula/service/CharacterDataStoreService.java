package local.example.fabula.service;

import local.example.fabula.model.Character;

import java.util.ArrayList;
import java.util.List;

public class CharacterDataStoreService {

    private final List<Character> characters;

    public CharacterDataStoreService() {
        characters = new ArrayList<>();
    }
}
