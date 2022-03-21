package local.example.fabula.service;

import local.example.fabula.model.Author;

import java.util.ArrayList;
import java.util.List;

public class AuthorDataStoreService {
    
    private final List<Author> authors;

    public AuthorDataStoreService() {
        authors = new ArrayList<>();
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void add(Author author) {
        this.authors.add(author);
    }

    public void remove(int index) {
        this.authors.remove(index);
    }

    public Author get(int index) {
        return this.authors.get(index);
    }

    public int size() {
        return this.authors.size();
    }
}
