package local.example.nimble.api.resource;

import io.quarkus.hibernate.reactive.panache.Panache;
import io.quarkus.panache.common.Sort;
import io.smallrye.mutiny.Uni;

import local.example.nimble.api.model.Employee;

import org.jboss.resteasy.reactive.ResponseStatus;
import org.jboss.resteasy.reactive.RestPath;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.net.HttpURLConnection;
import java.util.List;

@Path("/api/v1/employees")
public class EmployeeResource {

    @GET
    @Path(value = "/probe")
    @Produces(MediaType.TEXT_PLAIN)
    @ResponseStatus(HttpURLConnection.HTTP_OK)
    public String probe() {
        return "employees";
    }

    @POST
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
    @Produces(MediaType.APPLICATION_JSON)
    @ResponseStatus(HttpURLConnection.HTTP_OK)
    public Uni<List<Employee>> readAll(){
        return Employee.listAll(Sort.by("surname"));
    }

    @GET
    @Path(value = "{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @ResponseStatus(HttpURLConnection.HTTP_OK)
    public Uni<Employee> read(@RestPath Long id) {
        return Employee.findById(id);
    }

    @PUT
    @Path(value = "{id}")
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
                                    temp.setName(employee.getName());
                                    temp.setSurname(employee.getSurname());
                                    temp.setUsername(employee.getUsername());
                                    temp.setBirthday(employee.getBirthday());
                                    temp.setRecruited(employee.getRecruited());
                                }
                        )
                        .onItem().ifNotNull().transform(temp -> Response.ok(temp).build())
                        .onItem().ifNull().continueWith(Response.noContent().status(Response.Status.NOT_FOUND)::build)
        );
    }
}
