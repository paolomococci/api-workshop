package local.example.nimble.api.resource;

import io.quarkus.panache.common.Sort;
import io.smallrye.mutiny.Uni;

import local.example.nimble.api.model.Employee;

import org.jboss.resteasy.reactive.ResponseStatus;
import org.jboss.resteasy.reactive.RestPath;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

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

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @ResponseStatus(HttpURLConnection.HTTP_OK)
    public Uni<List<Employee>> readAll(){
        return Employee.listAll(Sort.by("surname"));
    }

    @GET
    @Path(value = "{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @ResponseStatus(HttpURLConnection.HTTP_OK)
    public Uni<Employee> read(@RestPath Long id) {
        return Employee.findById(id);
    }
}
