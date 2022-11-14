package local.example.graphql.repository;

import local.example.graphql.model.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository
        extends CrudRepository<Article, String> {
}
