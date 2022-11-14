package local.example.graphql.controller;

import local.example.graphql.repo.AuthorRepo;
import org.springframework.stereotype.Controller;

@Controller
public class AuthorController {
    private final AuthorRepo authorRepo;

    public AuthorController(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }
}
