package com.atm.controllers;

import com.atm.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


public interface SignUpController {

    @PostMapping("/signup")
    ResponseEntity<String> signUp(@RequestBody User user);

    @GetMapping("/users")
    ResponseEntity<List<User>> getAll();
}
