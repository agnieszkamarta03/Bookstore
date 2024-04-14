package com.example.bookstore.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResponseBody {

    @ExceptionHandler
    public ResponseEntity<ExceptionMessage> bookException(BookNotFoundException e){
        ExceptionMessage exceptionMessage = new ExceptionMessage();
        exceptionMessage.setStatus(HttpStatus.NOT_FOUND.value());
        exceptionMessage.setReason("Couldn't find book");
        exceptionMessage.setTime(System.currentTimeMillis());

        return new ResponseEntity(exceptionMessage,HttpStatus.NOT_FOUND);

    }
}
