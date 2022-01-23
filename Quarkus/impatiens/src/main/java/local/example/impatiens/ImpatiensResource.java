package local.example.impatiens;

import io.quarkus.hibernate.reactive.panache.Panache;
import io.smallrye.mutiny.Uni;

import local.example.impatiens.entity.Impatiens;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/impatiens")
public class ImpatiensResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String feedback() {
        return "-- impatiens API --";
    }

    @POST
    @Path("/api/v1/create")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Uni<Response> create(Impatiens impatiens) {
        if (impatiens == null) {
            throw new WebApplicationException(
                    "Unprocessable Entity: null entity that cannot be processed",
                    422
            );
        }

        if (impatiens.id != null) {
            throw new WebApplicationException(
                    "Unprocessable Entity: one the entity to which an identifier has already been assigned cannot be processed",
                    422
            );
        }

        return Panache
                .withTransaction(impatiens::persist)
                .replaceWith(
                        Response.ok(impatiens).status(Response.Status.CREATED)::build
                );
    }
}
