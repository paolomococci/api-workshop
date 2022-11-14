package local.example.graphql.repo;

import local.example.graphql.model.Article;

import java.util.List;

public class ArticleRepo {
    private final List<Article> articles;

    public ArticleRepo(List<Article> articles) {
        this.articles = articles;
    }

    public List<Article> getRecentArticles(
            int count,
            int offset
    ) {
        return null;
    }

    public List<Article> getArticlesOfAuthor(String authorId) {
        return null;
    }
}
