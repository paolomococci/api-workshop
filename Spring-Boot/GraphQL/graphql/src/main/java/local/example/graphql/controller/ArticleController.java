package local.example.graphql.controller;

import local.example.graphql.model.Article;
import local.example.graphql.repository.ArticleRepository;
import local.example.graphql.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ArticleController {

    @Autowired
    private ArticleRepository articleRepository;

    @Autowired
    private AuthorRepository authorRepository;

    @QueryMapping
    public List<Article> recentArticles(
            @Argument int count,
            @Argument int offset
    ) {
        return articleRepository.findRecentArticles(count, offset);
    }
}
