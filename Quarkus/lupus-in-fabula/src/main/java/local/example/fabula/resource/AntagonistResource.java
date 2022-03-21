package local.example.fabula.resource;

import local.example.fabula.model.Antagonist;
import local.example.fabula.service.AntagonistDataStoreService;

import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

import javax.inject.Inject;

import java.util.List;

@GraphQLApi
public class AntagonistResource {

    @Inject
    AntagonistDataStoreService antagonistDataStoreService;

    @Query("readAllAntagonists")
    @Description("read all list of antagonists stored in this system")
    public List<Antagonist> readAllAntagonists() {
        // TODO
        return null;
    }
}
