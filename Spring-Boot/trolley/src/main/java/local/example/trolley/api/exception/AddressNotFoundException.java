package local.example.trolley.api.exception;

public class AddressNotFoundException
        extends RuntimeException {

    public AddressNotFoundException(Long id) {
        super("could not find address with id: " + id);
    }
}
