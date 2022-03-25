package local.example.fabula.resource;

import local.example.fabula.model.Hero;
import local.example.fabula.service.HeroDataStoreService;

import org.eclipse.microprofile.graphql.*;

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

    @Mutation
    public Hero createHero(Hero hero) {
        // TODO
        return null;
    }

    @Mutation
    public Hero updateHero(@Name("idOfHero") String id, Hero hero) {
        // TODO
        return null;
    }

    @Mutation
    public Hero partialUpdateHero(@Name("idOfHero") String id, Hero hero) {
        // TODO
        return null;
    }

    @Mutation
    public Hero deleteHero(@Name("idOfHero") String id) {
        // TODO
        return null;
    }
}
