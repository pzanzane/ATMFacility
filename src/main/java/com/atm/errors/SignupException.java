package com.atm.errors;

public class SignupException extends RuntimeException{
    public SignupException(String message) {
        super(message);
    }
}
