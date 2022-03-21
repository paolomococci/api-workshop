package local.example.fabula.resource;

import local.example.fabula.service.AuthorDataStoreService;
import org.eclipse.microprofile.graphql.GraphQLApi;

import javax.inject.Inject;

@GraphQLApi
public class AuthorResource {

    @Inject
    AuthorDataStoreService authorDataStoreService;
}
