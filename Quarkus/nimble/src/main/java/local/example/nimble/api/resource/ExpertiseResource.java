package local.example.nimble.api.resource;

import io.quarkus.hibernate.reactive.panache.Panache;
import io.quarkus.panache.common.Sort;
import io.smallrye.mutiny.Uni;

import local.example.nimble.api.model.Expertise;

import org.jboss.resteasy.reactive.ResponseStatus;
import org.jboss.resteasy.reactive.RestPath;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

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

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Response> create(Expertise expertise) {
        if (expertise == null || expertise.id != null)
            throw new WebApplicationException("Unprocessable Entity", 422);

        return Panache.withTransaction(expertise::persist)
                .replaceWith(
                        Response.ok(expertise).status(Response.Status.CREATED)::build
                );
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @ResponseStatus(HttpURLConnection.HTTP_OK)
    public Uni<List<Expertise>> readAll(){
        return Expertise.listAll(Sort.by("name"));
    }

    @GET
    @Path(value = "{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @ResponseStatus(HttpURLConnection.HTTP_OK)
    public Uni<Expertise> read(@RestPath Long id) {
        return Expertise.findById(id);
    }
}
