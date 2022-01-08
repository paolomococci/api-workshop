package local.example.trolley.api.exception;

public class ProductNotFoundException
        extends RuntimeException {

    public ProductNotFoundException(Long id) {
        super("could not find product with id: " + id);
    }
}
