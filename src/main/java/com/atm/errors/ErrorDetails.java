package com.atm.errors;


import lombok.Getter;

@Getter
public class ErrorDetails {

    private final int errorCode;
    private final String message;

    public ErrorDetails(final int errorCode,
                        final String message) {
        this.errorCode = errorCode;
        this.message = message;
    }
}
