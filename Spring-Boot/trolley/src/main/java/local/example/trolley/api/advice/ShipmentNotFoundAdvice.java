package local.example.trolley.api.advice;

import local.example.trolley.api.exception.ShipmentNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ShipmentNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String shipmentNotFoundHandler(
            ShipmentNotFoundException shipmentNotFoundException
    ) {
        return shipmentNotFoundException.getMessage();
    }
}
