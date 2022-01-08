package local.example.trolley.api.exception;

public class ItemNotFoundException
        extends RuntimeException {

    public ItemNotFoundException(Long id) {
        super("could not find item with id: " + id);
    }
}
