package local.example.fabula.resource;

import local.example.fabula.model.Author;
import local.example.fabula.service.AuthorDataStoreService;

import org.eclipse.microprofile.graphql.*;

import javax.inject.Inject;

import java.util.List;

@GraphQLApi
public class AuthorResource {

    @Inject
    AuthorDataStoreService authorDataStoreService;

    @Query("readAllAuthors")
    @Description("read all list of authors stored in this system")
    public List<Author> readAllAuthors() {
        // TODO
        return null;
    }

    @Query
    @Description("read a author from id")
    public Author readAuthor(@Name("idOfAuthor") String id) {
        // TODO
        return null;
    }

    @Mutation
    public Author createAuthor(Author author) {
        // TODO
        return null;
    }

    @Mutation
    public Author updateAuthor(@Name("idOfAuthor") String id, Author author) {
        // TODO
        return null;
    }

    @Mutation
    public Author partialUpdateAuthor(@Name("idOfAuthor") String id, Author author) {
        // TODO
        return null;
    }

    @Mutation
    public Author deleteAuthor(@Name("idOfAuthor") String id) {
        // TODO
        return null;
    }
}
