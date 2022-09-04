package local.example.nimble.api.resource;

import io.quarkus.hibernate.reactive.panache.Panache;
import io.quarkus.vertx.web.Route;
import io.smallrye.mutiny.Uni;

import local.example.nimble.api.model.Employee;

import org.jboss.resteasy.reactive.RestPath;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.util.List;

@ApplicationScoped
@Path("employees")
public class EmployeeResource {

    @Route(
            path = "/api/v1/employees/probe",
            methods = Route.HttpMethod.GET,
            produces = MediaType.TEXT_PLAIN
    )
    public String probe() {
        return "employees";
    }

    @POST
    @Path("/api/v1/create")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Response> create(Employee employee) {
        if (employee == null || employee.id != null)
            throw new WebApplicationException("Unprocessable Entity", 422);

        return Panache.withTransaction(employee::persist)
                .replaceWith(
                        Response.ok(employee).status(Response.Status.CREATED)::build
                );
    }

    @GET
    @Path("/api/v1/read/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Employee> read(@RestPath Long id) {
        return Employee.read(id);
    }

    @GET
    @Path("/api/v1/itemise")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<List<Employee>> itemise(){
        return Employee.itemise();
    }

    @PUT
    @Path(value = "/api/v1/update/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Response> update(
            @RestPath Long id,
            Employee employee
    ) {
        if (employee == null || employee.id != null)
            throw new WebApplicationException("Unprocessable Entity", 422);

        return Panache.withTransaction(
                () -> Employee.<Employee> findById(id)
                        .onItem().ifNotNull().invoke(
                                temp -> {
                                    temp.name = employee.name;
                                    temp.surname = employee.surname;
                                    temp.username = employee.username;
                                    temp.birthday = employee.birthday;
                                    temp.recruited = employee.recruited;
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
                () -> Employee.deleteById(id)
        ).map(
                temp -> temp ? Response.ok().status(Response.Status.NO_CONTENT).build()
                        : Response.ok().status(Response.Status.NOT_FOUND).build()
        );
    }
}
