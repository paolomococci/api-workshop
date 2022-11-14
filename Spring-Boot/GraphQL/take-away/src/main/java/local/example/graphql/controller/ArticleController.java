package local.example.graphql.controller;

import local.example.graphql.repo.ArticleRepo;
import local.example.graphql.repo.AuthorRepo;
import org.springframework.stereotype.Controller;

@Controller
public class ArticleController {
    private final AuthorRepo authorRepo;
    private final ArticleRepo articleRepo;

    public ArticleController(
            AuthorRepo authorRepo,
            ArticleRepo articleRepo
    ) {
        this.authorRepo = authorRepo;
        this.articleRepo = articleRepo;
    }
}
