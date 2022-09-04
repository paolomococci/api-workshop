package local.example.trolley.api.exception;

public class AuthorizationNotFoundException
        extends RuntimeException {

    public AuthorizationNotFoundException(Long id) {
        super("could not find authorization with id: " + id);
    }
}
