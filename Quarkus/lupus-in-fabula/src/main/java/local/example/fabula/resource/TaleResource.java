package local.example.fabula.resource;

import local.example.fabula.model.Antagonist;
import local.example.fabula.model.Author;
import local.example.fabula.model.Hero;
import local.example.fabula.model.Tale;
import local.example.fabula.service.TaleExamplesDataStoreService;

import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

import javax.inject.Inject;

import java.util.List;

@GraphQLApi
public class TaleResource {

    @Inject
    TaleExamplesDataStoreService taleExamplesDataStoreService;

    @Query("readAllTales")
    @Description("read all list of tales stored in this system")
    public List<Tale> readAllTales() {
        // TODO
        return null;
    }

    @Query("readAllAuthors")
    @Description("read all list of authors stored in this system")
    public List<Author> readAllAuthors() {
        // TODO
        return null;
    }

    @Query("readAllHeroes")
    @Description("read all list of heroes stored in this system")
    public List<Hero> readAllHeroes() {
        // TODO
        return null;
    }

    @Query("readAllAntagonists")
    @Description("read all list of antagonists stored in this system")
    public List<Antagonist> readAllAntagonists() {
        // TODO
        return null;
    }
}
