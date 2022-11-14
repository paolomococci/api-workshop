package local.example.graphql.controller;

import local.example.graphql.model.Article;
import local.example.graphql.model.Author;
import local.example.graphql.repository.ArticleRepository;
import local.example.graphql.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class AuthorController {

    @Autowired
    private ArticleRepository articleRepository;

    @SchemaMapping
    public List<Article> authors(Author author) {
        return articleRepository.findArticleByAuthorId(author.getId());
    }
}
