package local.example.nimble.api.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

public class EmployeeExceptionMapper
        implements ExceptionMapper<Exception> {

    @Override
    public Response toResponse(Exception exception) {
        return null;
    }
}
