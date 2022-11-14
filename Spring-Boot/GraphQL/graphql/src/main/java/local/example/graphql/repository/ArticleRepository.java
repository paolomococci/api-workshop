package local.example.graphql.repository;

import local.example.graphql.model.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository
        extends CrudRepository<Article, String> {
    List<Article> findArticleByAuthorId(String id);

    List<Article> findRecentArticles(int count, int offset);
}
