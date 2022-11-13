package local.example.graphql.controller;

import local.example.graphql.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class AuthorController {

    @Autowired
    private Author author;

    @SchemaMapping
    public List<Author> authors(Author author) {
        // TODO
        return null;
    }
}
