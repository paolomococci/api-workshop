package local.example.graphql.repo;

import local.example.graphql.model.Article;

import java.util.List;
import java.util.stream.Collectors;

public class ArticleRepo {
    private final List<Article> articles;

    public ArticleRepo(List<Article> articles) {
        this.articles = articles;
    }

    public List<Article> getRecentArticles(
            int count,
            int offset
    ) {
        return articles.stream()
                .skip(offset).limit(count)
                .collect(Collectors.toList());
    }

    public List<Article> getArticlesOfAuthor(String authorId) {
        return articles.stream().filter(
                article -> authorId.equals(article.getAuthorId())
        ).collect(Collectors.toList());
    }

    public void save(Article article) {
        this.articles.add(article);
    }
}
