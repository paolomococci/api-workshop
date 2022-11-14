package local.example.graphql.controller;

import local.example.graphql.model.Article;
import local.example.graphql.model.Author;
import local.example.graphql.repository.ArticleRepository;
import local.example.graphql.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.UUID;

@Controller
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private ArticleRepository articleRepository;

    @SchemaMapping
    public List<Article> authors(Author author) {
        return articleRepository.findArticleByAuthorId(author.getId());
    }

    @SchemaMapping
    public Author author(Author author) {
        if (authorRepository.findById(author.getId()).isPresent())
            return  authorRepository.findById(author.getId()).get();
        return new Author();
    }

    @MutationMapping
    public Author createAuthor(
            @Argument String name,
            @Argument String surname,
            @Argument String nickname
    ) {
        Author author = new Author();
        author.setId(UUID.randomUUID().toString());
        // TODO
        authorRepository.save(author);
        return author;
    }
}
