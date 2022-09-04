package local.mocaccino.rest.json;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/mocaccino")
public class MocaccinoResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String mocaccino() {
        return "mocaccino API at work!";
    }
}
