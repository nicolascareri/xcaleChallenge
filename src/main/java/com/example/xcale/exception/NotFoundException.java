package com.example.xcale.exception;

/**
 * Generic not found exception
 */
public class NotFoundException extends IllegalArgumentException {

    /**
     * @param message the name of the entity that cannot be found
     */
    public NotFoundException(String message) {
        super(message + " not found");
    }

}
