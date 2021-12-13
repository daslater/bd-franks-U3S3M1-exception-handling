package com.frank.types;

public class NonNumericInputException extends RuntimeException {
    public NonNumericInputException() {};
    public NonNumericInputException(String message) {
        super(message);
    }
}
