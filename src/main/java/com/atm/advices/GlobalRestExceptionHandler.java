package com.atm.advices;

import com.atm.errors.ErrorDetails;
import com.atm.errors.SignupException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalRestExceptionHandler {

    @ExceptionHandler(SignupException.class)
    public ResponseEntity<ErrorDetails> handleSignUpError(SignupException signupException) {

        final ErrorDetails errorDetails = new ErrorDetails(101, signupException.getMessage());
        return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
    }
}
