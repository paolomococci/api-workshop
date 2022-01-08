package local.example.trolley.api.exception;

public class SupplierNotFoundException
        extends RuntimeException {

    public SupplierNotFoundException(Long id) {
        super("could not find supplier with id: " + id);
    }
}
