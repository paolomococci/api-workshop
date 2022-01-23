package local.example.impatiens;

import io.quarkus.hibernate.reactive.panache.Panache;
import io.quarkus.panache.common.Sort;
import io.smallrye.mutiny.Uni;

import local.example.impatiens.entity.Impatiens;

import org.jboss.resteasy.reactive.RestPath;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.util.List;

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

    @GET
    @Path("/api/v1/read/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Impatiens> read(@RestPath Long id) {
        return Impatiens.findById(id);
    }

    @GET
    @Path("/api/v1/itemise")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<List<Impatiens>> itemise() {
        return Impatiens.listAll(Sort.by("cultivarName"));
    }

    @GET
    @Path("/api/v1/trendy")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<List<Impatiens>> trendy() {
        return Impatiens.readAllTrendy();
    }

    @GET
    @Path("/api/v1/alive")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<List<Impatiens>> alive() {
        return Impatiens.readAllAlive();
    }

    @GET
    @Path("/api/v1/discovered")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<List<Impatiens>> justDiscovered() {
        return Impatiens.readAllJustDiscovered();
    }

    @GET
    @Path("/api/v1/abandoned")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<List<Impatiens>> abandoned() {
        return Impatiens.readAllAbandoned();
    }

    @GET
    @Path("/api/v1/lost")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<List<Impatiens>> lost() {
        return Impatiens.readAllLost();
    }

    @PUT
    @Path("/api/v1/update/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Uni<Response> update(
            @RestPath Long id,
            Impatiens impatiens
    ) {
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
                .withTransaction(
                        () -> Impatiens.<Impatiens> findById(id).onItem().ifNotNull().invoke(
                                        entity -> {
                                            entity.cultivarName = impatiens.cultivarName;
                                            entity.developedDate = impatiens.developedDate;
                                            entity.marketingDate = impatiens.marketingDate;
                                            entity.cultivarStatus = impatiens.cultivarStatus;
                                        }
                                )
                                .onItem().ifNotNull().transform(entity -> Response.ok(entity).build())
                                .onItem().ifNull().continueWith(Response.ok().status(Response.Status.NOT_FOUND)::build)
                );
    }

    @PATCH
    @Path("/api/v1/amend/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Uni<Response> amend(
            @RestPath Long id,
            Impatiens impatiens
    ) {
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
                .withTransaction(
                        () -> Impatiens.<Impatiens> findById(id).onItem().ifNotNull().invoke(
                                        entity -> {
                                            if (impatiens.cultivarName != null)
                                                entity.cultivarName = impatiens.cultivarName;
                                            if (impatiens.developedDate != null)
                                                entity.developedDate = impatiens.developedDate;
                                            if (impatiens.marketingDate != null)
                                                entity.marketingDate = impatiens.marketingDate;
                                            if (impatiens.cultivarStatus != null)
                                                entity.cultivarStatus = impatiens.cultivarStatus;
                                        }
                                )
                                .onItem().ifNotNull().transform(entity -> Response.ok(entity).build())
                                .onItem().ifNull().continueWith(Response.ok().status(Response.Status.NOT_FOUND)::build)
                );
    }
}
