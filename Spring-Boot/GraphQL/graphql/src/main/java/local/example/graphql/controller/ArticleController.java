package local.example.graphql.controller;

import local.example.graphql.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ArticleController {

    @Autowired
    private Article article;
}
