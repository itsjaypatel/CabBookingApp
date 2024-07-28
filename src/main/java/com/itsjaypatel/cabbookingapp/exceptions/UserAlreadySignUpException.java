package com.itsjaypatel.cabbookingapp.exceptions;


public class UserAlreadySignUpException extends RuntimeException {

    public UserAlreadySignUpException(String message) {
        super(message);
    }
}
