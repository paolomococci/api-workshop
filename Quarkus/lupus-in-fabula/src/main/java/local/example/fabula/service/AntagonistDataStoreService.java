package local.example.fabula.service;

import local.example.fabula.model.Antagonist;

import java.util.ArrayList;
import java.util.List;

public class AntagonistDataStoreService {

    private final List<Antagonist> antagonists;

    public AntagonistDataStoreService() {
        antagonists = new ArrayList<>();
    }

    public List<Antagonist> getAntagonists() {
        return antagonists;
    }

    public void add(Antagonist antagonist) {
        this.antagonists.add(antagonist);
    }

    public void remove(int index) {
        this.antagonists.remove(index);
    }

    public Antagonist get(int index) {
        return this.antagonists.get(index);
    }

    public int size() {
        return this.antagonists.size();
    }
}
