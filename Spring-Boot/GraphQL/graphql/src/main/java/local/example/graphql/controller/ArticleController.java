package local.example.graphql.controller;

import local.example.graphql.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ArticleController {

    @Autowired
    private Article article;

    @SchemaMapping
    public List<Article> articles(Article article) {
        // TODO
        return null;
    }
}
