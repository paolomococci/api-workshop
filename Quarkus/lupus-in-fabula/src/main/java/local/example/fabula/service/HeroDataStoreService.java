package local.example.fabula.service;

import local.example.fabula.model.Hero;

import java.util.ArrayList;
import java.util.List;

public class HeroDataStoreService {

    private final List<Hero> heroes;

    public HeroDataStoreService() {
        heroes = new ArrayList<>();
    }

    public List<Hero> getHeroes() {
        return heroes;
    }
}
