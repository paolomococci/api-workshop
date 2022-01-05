package local.example.demo.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.context.MessageSource;

@ControllerAdvice
public class RestApiErrorHandler {

    private static final Logger loggerFactory = LoggerFactory.getLogger(RestApiErrorHandler.class);
    private final MessageSource messageSource;

    public RestApiErrorHandler(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
}
