package com.company.exception;

public class HumanAlreadyExistsException extends RuntimeException {

    public HumanAlreadyExistsException(String message) {
        super(message);
    }
}
