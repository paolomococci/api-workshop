package local.example.trolley.api.exception;

public class TagNotFoundException
        extends RuntimeException {

    public TagNotFoundException(Long id) {
        super("could not find tag with id: " + id);
    }
}
