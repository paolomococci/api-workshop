package local.example.nimble.api.resource;

import io.quarkus.panache.common.Sort;
import io.smallrye.mutiny.Uni;

import local.example.nimble.api.model.Expertise;

import org.jboss.resteasy.reactive.ResponseStatus;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.net.HttpURLConnection;
import java.util.List;

@Path("/api/v1/expertise")
public class ExpertiseResource {

    @GET
    @Path(value = "/probe")
    @Produces(MediaType.TEXT_PLAIN)
    @ResponseStatus(HttpURLConnection.HTTP_OK)
    public String probe() {
        return "expertise";
    }

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @ResponseStatus(HttpURLConnection.HTTP_OK)
    public Uni<List<Expertise>> readAll(){
        return Expertise.listAll(Sort.by("name"));
    }
}
