package local.example.graphql.config;

import local.example.graphql.model.Author;
import local.example.graphql.repo.AuthorRepo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Configuration
public class GraphQLConfig {

    @Bean
    public AuthorRepo authorRepo() {
        List<Author> authors = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Author author = new Author();
            author.setId(UUID.randomUUID().toString());
            author.setName("name_" + i);
            author.setSurname("surname_" + i);
            author.setNickname("nickname_" + i);
            authors.add(author);
        }
        return new AuthorRepo(authors);
    }
}
