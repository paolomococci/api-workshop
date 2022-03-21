package local.example.fabula.service;

import local.example.fabula.model.Hero;

import javax.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class HeroDataStoreService {

    private final List<Hero> heroes;

    public HeroDataStoreService() {
        heroes = new ArrayList<>();
    }

    public List<Hero> getHeroes() {
        return heroes;
    }

    public void add(Hero hero) {
        this.heroes.add(hero);
    }

    public void remove(int index) {
        this.heroes.remove(index);
    }

    public Hero get(int index) {
        return this.heroes.get(index);
    }

    public int size() {
        return this.heroes.size();
    }
}
