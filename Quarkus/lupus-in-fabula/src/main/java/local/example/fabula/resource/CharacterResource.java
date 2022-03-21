package local.example.fabula.resource;

import local.example.fabula.model.Character;
import local.example.fabula.service.CharacterDataStoreService;

import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

import javax.inject.Inject;
import java.util.List;

@GraphQLApi
public class CharacterResource {

    @Inject
    CharacterDataStoreService characterDataStoreService;

    @Query("readAllCharacters")
    @Description("read all list of characters stored in this system")
    public List<Character> readAllCharacters() {
        // TODO
        return null;
    }
}
