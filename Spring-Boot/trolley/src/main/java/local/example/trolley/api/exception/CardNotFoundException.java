package local.example.trolley.api.exception;

public class CardNotFoundException
        extends RuntimeException {

    public CardNotFoundException(Long id) {
        super("could not find card with id: " + id);
    }
}
