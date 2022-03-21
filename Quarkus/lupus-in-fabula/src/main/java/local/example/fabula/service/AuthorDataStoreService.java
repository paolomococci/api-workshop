package local.example.fabula.service;

import local.example.fabula.model.Author;

import java.util.ArrayList;
import java.util.List;

public class AuthorDataStoreService {
    
    private final List<Author> authors;

    public AuthorDataStoreService() {
        authors = new ArrayList<>();
    }
}
