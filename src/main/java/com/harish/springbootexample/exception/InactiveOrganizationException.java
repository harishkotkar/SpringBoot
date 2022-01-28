package com.harish.springbootexample.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class InactiveOrganizationException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public InactiveOrganizationException(String message) {
        super(message);
    }
}
