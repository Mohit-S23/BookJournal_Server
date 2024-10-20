package com.bookJournal.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/server/test")
    public String getTestMessage() {
        return "Hello from Spring Boot!";
    }

}
