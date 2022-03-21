package local.example.fabula.resource;

import local.example.fabula.model.Tale;
import local.example.fabula.service.TaleDataStoreService;

import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

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
}
