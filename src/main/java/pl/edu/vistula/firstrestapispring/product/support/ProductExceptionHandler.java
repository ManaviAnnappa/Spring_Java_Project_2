package pl.edu.vistula.firstrestapispring.product.support;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import pl.edu.vistula.firstrestapispring.product.support.exception.ProductNotFoundException;
import pl.edu.vistula.firstrestapispring.product.api.response.ErrorMessageResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


@RestControllerAdvice
public class ProductExceptionHandler {

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ErrorMessageResponse> handleProductNotFound(ProductNotFoundException ex) {
        ErrorMessageResponse body = new ErrorMessageResponse(ex.getMessage());
        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
    }
}
