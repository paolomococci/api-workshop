package local.example.trolley.api.exception;

public class UserNotFoundException
        extends RuntimeException {

    public UserNotFoundException(Long id) {
        super("could not find user with id: " + id);
    }
}
