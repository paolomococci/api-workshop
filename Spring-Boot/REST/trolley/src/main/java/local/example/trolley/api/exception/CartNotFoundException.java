package local.example.trolley.api.exception;

public class CartNotFoundException
        extends RuntimeException {

    public CartNotFoundException(Long id) {
        super("could not find cart with id: " + id);
    }
}
