package local.example.trolley.api.advice;

import local.example.trolley.api.exception.AuthorizationNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class AuthorizationNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String authorizationNotFoundHandler(
            AuthorizationNotFoundException authorizationNotFoundException
    ) {
        return authorizationNotFoundException.getMessage();
    }
}
