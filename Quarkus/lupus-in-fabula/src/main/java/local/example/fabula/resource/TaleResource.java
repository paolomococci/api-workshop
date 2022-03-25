package local.example.fabula.resource;

import local.example.fabula.model.Tale;
import local.example.fabula.service.TaleDataStoreService;

import org.eclipse.microprofile.graphql.*;

import javax.inject.Inject;

import java.util.List;

@GraphQLApi
public class TaleResource {

    @Inject
    TaleDataStoreService taleDataStoreService;

    @Query("readAllTales")
    @Description("read all list of tales stored in this system")
    public List<Tale> readAllTales() {
        // TODO
        return null;
    }

    @Query
    @Description("read a tale from id")
    public Tale readTale(@Name("idOfTale") String id) {
        // TODO
        return null;
    }

    @Mutation
    public Tale createTale(Tale tale) {
        // TODO
        return tale;
    }

    @Mutation
    public Tale updateTale(@Name("idOfTale") String id, Tale tale) {
        // TODO
        return null;
    }

    @Mutation
    public Tale deleteTale(@Name("idOfTale") String id) {
        // TODO
        return null;
    }
}
