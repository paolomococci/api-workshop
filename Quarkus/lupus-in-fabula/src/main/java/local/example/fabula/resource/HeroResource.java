package local.example.fabula.resource;

import local.example.fabula.service.HeroDataStoreService;
import org.eclipse.microprofile.graphql.GraphQLApi;

import javax.inject.Inject;

@GraphQLApi
public class HeroResource {

    @Inject
    HeroDataStoreService heroDataStoreService;
}
