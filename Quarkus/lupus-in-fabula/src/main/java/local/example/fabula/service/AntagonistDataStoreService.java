package local.example.fabula.service;

import local.example.fabula.model.Antagonist;

import java.util.ArrayList;
import java.util.List;

public class AntagonistDataStoreService {

    private final List<Antagonist> antagonists;

    public AntagonistDataStoreService() {
        antagonists = new ArrayList<>();
    }
}
