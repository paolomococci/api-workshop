package local.example.trolley.api.exception;

public class OrderItemNotFoundException
        extends RuntimeException {

    public OrderItemNotFoundException(Long id) {
        super("could not find correlation with id: " + id);
    }
}
