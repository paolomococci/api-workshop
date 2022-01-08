package local.example.trolley.api.advice;

import local.example.trolley.api.exception.SupplierNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class SupplierNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String supplierNotFoundHandler(
            SupplierNotFoundException supplierNotFoundException
    ) {
        return supplierNotFoundException.getMessage();
    }
}
