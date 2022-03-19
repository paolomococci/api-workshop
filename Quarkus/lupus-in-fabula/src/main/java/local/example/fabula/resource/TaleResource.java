package local.example.fabula.resource;

import local.example.fabula.service.TaleExamplesTestService;
import org.eclipse.microprofile.graphql.GraphQLApi;

import javax.inject.Inject;

@GraphQLApi
public class TaleResource {

    @Inject
    TaleExamplesTestService taleExamplesTestService;
}
