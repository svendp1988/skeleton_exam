package be.pxl.jax.api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdvice {


    @ExceptionHandler(value = {ObjectNotFoundException.class})
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public ErrorMessage objectNotFoundException(RuntimeException ex) {
        return new ErrorMessage(ex.getMessage());
    }

    @ExceptionHandler(value = {RWException.class})
    @ResponseStatus(value = HttpStatus.METHOD_NOT_ALLOWED)
    public ErrorMessage rwException(RuntimeException ex) { return new ErrorMessage(ex.getMessage()); }
}
