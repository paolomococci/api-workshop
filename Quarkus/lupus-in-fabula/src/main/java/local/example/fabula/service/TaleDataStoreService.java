package local.example.fabula.service;

import local.example.fabula.model.Tale;

import java.util.ArrayList;
import java.util.List;

public class TaleDataStoreService {

    private final List<Tale> tales;

    public TaleDataStoreService() {
        this.tales = new ArrayList<>();
    }

    public List<Tale> getTales() {
        return tales;
    }

    public void add(Tale tale) {
        this.tales.add(tale);
    }
}
