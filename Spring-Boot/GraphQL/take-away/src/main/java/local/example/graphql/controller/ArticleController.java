package local.example.graphql.controller;

import local.example.graphql.repo.ArticleRepo;
import org.springframework.stereotype.Controller;

@Controller
public class ArticleController {
    private final ArticleRepo articleRepo;

    public ArticleController(ArticleRepo articleRepo) {
        this.articleRepo = articleRepo;
    }
}
