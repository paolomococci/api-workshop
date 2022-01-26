package local.example.nimble;

import io.quarkus.vertx.web.Route;
import io.smallrye.mutiny.Uni;

import local.example.nimble.api.model.Employee;
import local.example.nimble.api.model.Expertise;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.util.List;

@Path("/nimble")
public class NimbleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from nimble";
    }

    @Route(
            path = "/api/v2/employees/itemise",
            methods = Route.HttpMethod.GET,
            produces = MediaType.APPLICATION_JSON
    )
    public Uni<List<Employee>> employeeListUni() {
        return Employee.itemise();
    }

    @Route(
            path = "/api/v2/expertise/itemise",
            methods = Route.HttpMethod.GET,
            produces = MediaType.APPLICATION_JSON
    )
    public Uni<List<Expertise>> expertiseListUni() {
        return Expertise.itemise();
    }

    @Route(
            path = "/api/v2/conjunction",
            methods = Route.HttpMethod.GET,
            produces = MediaType.TEXT_PLAIN
    )
    public Uni<List<String>> conjunctionListUni() {
        return Expertise.conjunction();
    }
}
