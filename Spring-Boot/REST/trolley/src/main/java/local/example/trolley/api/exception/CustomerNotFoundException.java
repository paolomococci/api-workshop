package local.example.trolley.api.exception;

public class CustomerNotFoundException
        extends RuntimeException {

    public CustomerNotFoundException(Long id) {
        super("could not find customer with id: " + id);
    }
}
