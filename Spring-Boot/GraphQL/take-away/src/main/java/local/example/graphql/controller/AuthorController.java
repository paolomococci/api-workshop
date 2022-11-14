package local.example.graphql.controller;

import local.example.graphql.model.Article;
import local.example.graphql.model.Author;
import local.example.graphql.repo.ArticleRepo;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class AuthorController {
    private final ArticleRepo articleRepo;

    public AuthorController(ArticleRepo articleRepo) {
        this.articleRepo = articleRepo;
    }

    @SchemaMapping
    public List<Article> articles(Author author) {
        return this.articleRepo.getArticlesOfAuthor(author.getId());
    }
}
