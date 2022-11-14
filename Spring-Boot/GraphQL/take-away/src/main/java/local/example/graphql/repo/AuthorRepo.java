package local.example.graphql.repo;

import local.example.graphql.model.Author;

import java.util.List;

public class AuthorRepo {
    private final List<Author> authors;

    public AuthorRepo(List<Author> authors) {
        this.authors = authors;
    }
}
