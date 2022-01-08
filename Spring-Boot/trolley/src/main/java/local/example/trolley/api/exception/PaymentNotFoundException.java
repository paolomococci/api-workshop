package local.example.trolley.api.exception;

public class PaymentNotFoundException
        extends RuntimeException {

    public PaymentNotFoundException(Long id) {
        super("could not find payment with id: " + id);
    }
}
