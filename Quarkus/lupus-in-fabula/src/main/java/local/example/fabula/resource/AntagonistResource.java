package local.example.fabula.resource;

import local.example.fabula.model.Antagonist;
import local.example.fabula.service.AntagonistDataStoreService;

import org.eclipse.microprofile.graphql.*;

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

    @Query
    @Description("read a antagonist from id")
    public Antagonist readAntagonist(@Name("idOfAntagonist") String id) {
        // TODO
        return null;
    }

    @Mutation
    public Antagonist createAntagonist(Antagonist antagonist) {
        // TODO
        return null;
    }
}
