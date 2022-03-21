package local.example.fabula.resource;

import local.example.fabula.service.CharacterDataStoreService;
import org.eclipse.microprofile.graphql.GraphQLApi;

import javax.inject.Inject;

@GraphQLApi
public class CharacterResource {

    @Inject
    CharacterDataStoreService characterDataStoreService;
}
