package local.example.graphql.repository;

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
}
