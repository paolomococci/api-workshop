package local.example.openapi;

import javax.ws.rs.*;
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
    @Produces(MediaType.APPLICATION_JSON)
    public Set<Sample> readAll() {
        return this.samples;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Set<Sample> create(Sample sample) {
        this.samples.add(sample);
        return this.samples;
    }

    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    public Set<Sample> delete(Sample sample) {
        this.samples.removeIf(
                temp -> temp.getName().contentEquals(sample.getName())
        );
        return this.samples;
    }
}
