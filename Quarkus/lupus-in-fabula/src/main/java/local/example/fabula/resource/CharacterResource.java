package local.example.fabula.resource;

import local.example.fabula.model.Character;
import local.example.fabula.service.CharacterDataStoreService;

import org.eclipse.microprofile.graphql.*;

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

    @Query
    @Description("read a character from id")
    public Character readCharacter(@Name("idOfCharacter") String id) {
        // TODO
        return null;
    }

    @Mutation
    public Character createCharacter(Character character) {
        // TODO
        return null;
    }

    @Mutation
    public Character updateCharacter(@Name("idOfCharacter") String id, Character character) {
        // TODO
        return null;
    }

    @Mutation
    public Character deleteCharacter(@Name("idOfCharacter") String id) {
        // TODO
        return null;
    }
}
