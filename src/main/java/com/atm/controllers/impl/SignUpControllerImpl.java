package com.atm.controllers.impl;

import com.atm.controllers.SignUpController;
import com.atm.entities.User;
import com.atm.errors.SignupException;
import com.atm.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;


public class SignUpControllerImpl implements SignUpController {

    private static final Logger logger = LoggerFactory.getLogger(SignUpControllerImpl.class);

    @Autowired
    private UserService userService;

    @Override
    public ResponseEntity<String> signUp(User user) {

        try {
            userService.registerUser(user);
            return ResponseEntity.ok("New user signup successfully");
        } catch (SignupException e) {
            logger.error("Error occurred Signup {}", e.getMessage());
            throw e;
        }
    }
}
