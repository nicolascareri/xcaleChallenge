package com.example.xcale.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler( {GroupNotFoundException.class} )
    public ResponseEntity<?> handleException (GroupNotFoundException ex) {
        return new ResponseEntity<>( ex.getMessage() , HttpStatus.NOT_FOUND);
    }


}
