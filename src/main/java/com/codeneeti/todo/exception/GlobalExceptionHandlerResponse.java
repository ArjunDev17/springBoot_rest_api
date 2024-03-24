package com.codeneeti.todo.exception;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandlerResponse {
   Logger logger=LoggerFactory.getLogger(GlobalExceptionHandlerResponse.class);

    //we can add multiple exception
    @ExceptionHandler(value={NullPointerException.class, ArithmeticException.class})
    public ResponseEntity<String> nullPointerException(Exception ex){
        logger.info("logger exception from  Global");
        System.out.println(ex.getMessage());
        System.out.println("Null Pointer exception");
        return new ResponseEntity<>("null pointer exception "+ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ExceptionResponse> handlerResourceNotFoundException(ResourceNotFoundException e){
        logger.error("ERROR :{}",e.getMessage());
        ExceptionResponse exceptionResponse=new ExceptionResponse();
        exceptionResponse.setMessage(e.getMessage());
        exceptionResponse.setStatus(HttpStatus.NOT_FOUND);
        exceptionResponse.setSuccess(false);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exceptionResponse);
    }
}
