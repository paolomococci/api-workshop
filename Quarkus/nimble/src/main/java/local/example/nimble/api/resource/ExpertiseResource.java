package local.example.nimble.api.resource;

import io.quarkus.hibernate.reactive.panache.Panache;
import io.quarkus.panache.common.Sort;
import io.quarkus.vertx.web.Route;
import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;

import local.example.nimble.api.model.Expertise;

import org.jboss.resteasy.reactive.RestPath;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@ApplicationScoped
@Path("expertise")
public class ExpertiseResource {

    @Route(
            path = "/api/v1/expertise/probe",
            methods = Route.HttpMethod.GET,
            produces = MediaType.TEXT_PLAIN
    )
    public String probe() {
        return "expertise";
    }

    @POST
    @Path("/api/v1/create")
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
    @Path("/api/v1/read/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Expertise> read(@RestPath Long id) {
        return Expertise.findById(id);
    }

    @GET
    @Path("/api/v1/itemise")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<List<Expertise>> itemise() {
        return Expertise.listAll(Sort.by("name"));
    }

    @PUT
    @Path(value = "/api/v1/update/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Response> update(
            @RestPath Long id,
            Expertise expertise
    ) {
        if (expertise == null || expertise.id != null)
            throw new WebApplicationException("Unprocessable Entity", 422);

        return Panache.withTransaction(
                () -> Expertise.<Expertise> findById(id)
                        .onItem().ifNotNull().invoke(
                                temp -> {
                                    temp.name = expertise.name;
                                    temp.description = expertise.description;
                                }
                        )
                        .onItem().ifNotNull().transform(temp -> Response.ok(temp).build())
                        .onItem().ifNull().continueWith(Response.noContent().status(Response.Status.NOT_FOUND)::build)
        );
    }

    @DELETE
    @Path(value = "/api/v1/delete/{id}")
    public Uni<Response> delete(@RestPath Long id) {
        return Panache.withTransaction(
                () -> Expertise.deleteById(id)
        ).map(
                temp -> temp ? Response.ok().status(Response.Status.NO_CONTENT).build()
                        : Response.ok().status(Response.Status.NOT_FOUND).build()
        );
    }
}
