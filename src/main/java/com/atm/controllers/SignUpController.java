package com.atm.controllers;

import com.atm.constants.Constants;
import com.atm.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.LogManager;
import java.util.logging.Logger;

@RestController
public interface SignUpController {

    @PostMapping(Constants.ROUTE.SIGNUP)
    ResponseEntity<String> signUp(@RequestBody User user);
}
