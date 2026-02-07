package org.example.crudjava.exception;

public class AutorNotFoundException extends RuntimeException {
    public AutorNotFoundException(String message) {
        super(message);
    }
}