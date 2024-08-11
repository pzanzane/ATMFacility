package com.atm.controllers.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @ResponseBody
    @GetMapping("/api/demo")
    public String demo() {
        return "Hello World";
    }
}
