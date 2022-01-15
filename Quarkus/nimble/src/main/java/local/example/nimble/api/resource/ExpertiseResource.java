package local.example.nimble.api.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/v1/expertise")
public class ExpertiseResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String probe() {
        return "expertise";
    }
}
