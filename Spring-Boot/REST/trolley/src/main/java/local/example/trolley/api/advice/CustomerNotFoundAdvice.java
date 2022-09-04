package local.example.trolley.api.advice;

import local.example.trolley.api.exception.CustomerNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class CustomerNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String customerNotFoundHandler(
            CustomerNotFoundException customerNotFoundException
    ) {
        return customerNotFoundException.getMessage();
    }
}
