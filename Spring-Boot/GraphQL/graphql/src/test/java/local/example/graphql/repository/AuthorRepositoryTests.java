package local.example.graphql.repository;

import local.example.graphql.model.Author;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class AuthorRepositoryTests {

    @Autowired
    private AuthorRepository authorRepository;

    @Test
    void contextTest() {
        assertThat(authorRepository).isNotNull();
    }

    @Test
    void createTest() {
        Author author = new Author();
        author.setName("John");
        author.setSurname("Doe");
        author.setNickname("jolly");
        authorRepository.save(author);
        assertThat(author.getId()).isGreaterThanOrEqualTo(0);
        assertThat(author.getName()).isEqualTo("John");
        assertThat(author.getSurname()).isEqualTo("Doe");
        assertThat(author.getNickname()).isEqualTo("jolly");
        assertThat(authorRepository.count()).isGreaterThanOrEqualTo(1L);
    }
}
