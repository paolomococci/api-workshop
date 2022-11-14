package local.example.graphql.controller;

import local.example.graphql.model.Article;
import local.example.graphql.model.Author;
import local.example.graphql.repo.ArticleRepo;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.UUID;

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

    @MutationMapping
    public Author create(
            @Argument String name,
            @Argument String surname,
            @Argument String nickname
    ) {
        Author author = new Author();
        author.setId(UUID.randomUUID().toString());
        return null;
    }
}
