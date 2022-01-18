package local.example.trolley.api.exception;

public class ResourceNotFoundException
        extends RuntimeException {

    public ResourceNotFoundException(String id) {
        super("could not find resource with id: " + id);
    }
}
