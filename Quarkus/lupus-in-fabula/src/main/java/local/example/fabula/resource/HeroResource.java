package local.example.fabula.resource;

import local.example.fabula.model.Hero;
import local.example.fabula.service.HeroDataStoreService;

import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Name;
import org.eclipse.microprofile.graphql.Query;

import javax.inject.Inject;

import java.util.List;

@GraphQLApi
public class HeroResource {

    @Inject
    HeroDataStoreService heroDataStoreService;

    @Query("readAllHeroes")
    @Description("read all list of heroes stored in this system")
    public List<Hero> readAllHeroes() {
        // TODO
        return null;
    }

    @Query
    @Description("read a hero from id")
    public Hero readHero(@Name("idOfHero") String id) {
        // TODO
        return null;
    }
}
