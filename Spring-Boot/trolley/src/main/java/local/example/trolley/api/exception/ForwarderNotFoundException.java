package local.example.trolley.api.exception;

public class ForwarderNotFoundException
        extends RuntimeException {

    public ForwarderNotFoundException(Long id) {
        super("could not find forwarder with id: " + id);
    }
}
