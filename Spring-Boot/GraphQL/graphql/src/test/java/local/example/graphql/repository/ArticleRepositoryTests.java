package local.example.graphql.repository;

import local.example.graphql.model.Article;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ArticleRepositoryTests {

    @Autowired
    private ArticleRepository articleRepository;

    @Test
    void contextTest() {
        assertThat(articleRepository).isNotNull();
    }

    @Test
    void createTest() {
        Article article = new Article();
        article.setTitle("some title");
        article.setText("sample text");
        article.setCategory("some category");
        article.setAuthorId(1);
        article.setReviewerId(2);
        articleRepository.save(article);
        assertThat(article.getId()).isGreaterThanOrEqualTo(0);
        assertThat(articleRepository.count()).isGreaterThanOrEqualTo(1L);
    }
}
