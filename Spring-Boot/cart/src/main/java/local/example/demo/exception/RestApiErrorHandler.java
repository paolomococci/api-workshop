package local.example.demo.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

import java.util.Locale;

@ControllerAdvice
public class RestApiErrorHandler {

    private static final Logger loggerFactory = LoggerFactory.getLogger(RestApiErrorHandler.class);

    private final MessageSource messageSource;

    public RestApiErrorHandler(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Error> handleException(
            HttpServletRequest httpServletRequest,
            Exception exception,
            Locale locale
    ) {
        exception.printStackTrace();

        Error error = ErrorUtil.createError(
                ErrorCode.GENERIC_ERROR.getErrorMessageKey(),
                ErrorCode.GENERIC_ERROR.getErrorCode(),
                HttpStatus.INTERNAL_SERVER_ERROR.value()
        ).setUrl(
                httpServletRequest.getRequestURL().toString()
        ).setRequestMethod(httpServletRequest.getMethod());

        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
