package local.example.openapi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

@Path("/sample")
public class SampleResource {

    private final Set<Sample> samples = Collections.newSetFromMap(
            Collections.synchronizedMap(new LinkedHashMap<>())
    );

    public SampleResource() {
        samples.add(new Sample("one", "someone"));
        samples.add(new Sample("two", "someone"));
        samples.add(new Sample("three", "someone"));
        samples.add(new Sample("four", "someone"));
        samples.add(new Sample("five", "someone"));
        samples.add(new Sample("six", "someone"));
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sample() {
        return "Sample at work!";
    }
}
