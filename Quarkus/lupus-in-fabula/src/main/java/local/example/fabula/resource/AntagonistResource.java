package local.example.fabula.resource;

import local.example.fabula.service.AntagonistDataStoreService;
import org.eclipse.microprofile.graphql.GraphQLApi;

import javax.inject.Inject;

@GraphQLApi
public class AntagonistResource {

    @Inject
    AntagonistDataStoreService antagonistDataStoreService;
}
