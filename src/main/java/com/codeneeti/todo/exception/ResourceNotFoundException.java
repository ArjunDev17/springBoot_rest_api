package com.codeneeti.todo.exception;

import org.springframework.http.HttpStatus;

public class ResourceNotFoundException extends RuntimeException{
    private String message;
    private HttpStatus status;

    public ResourceNotFoundException(String message, String message1, HttpStatus status) {
        super(message);
        this.message = message1;
        this.status = status;
    }
    public ResourceNotFoundException(){

    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }
}
