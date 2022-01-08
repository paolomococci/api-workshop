package local.example.trolley.api.exception;

public class ResourceNotFoundException
        extends RuntimeException {

    public ResourceNotFoundException(Long id) {
        super("could not find resource with id: " + id);
    }
}
