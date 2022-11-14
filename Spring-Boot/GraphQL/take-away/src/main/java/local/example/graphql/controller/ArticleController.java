package local.example.graphql.controller;

import local.example.graphql.model.Article;
import local.example.graphql.model.Author;
import local.example.graphql.repo.ArticleRepo;
import local.example.graphql.repo.AuthorRepo;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

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

    @QueryMapping
    public List<Article> recentArticles(
            @Argument int count,
            @Argument int offset
    ) {
        return this.articleRepo.getRecentArticles(
                count,
                offset
        );
    }

    @SchemaMapping
    public Author author(Article article) {
        return this.authorRepo.getAuthor(article.getAuthorId());
    }
}
