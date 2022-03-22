package local.example.fabula.resource;

import local.example.fabula.model.Author;
import local.example.fabula.model.Tale;
import local.example.fabula.service.AuthorDataStoreService;

import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Name;
import org.eclipse.microprofile.graphql.Query;

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
    public Tale readAuthor(@Name("idOfAuthor") String id) {
        // TODO
        return null;
    }
}
