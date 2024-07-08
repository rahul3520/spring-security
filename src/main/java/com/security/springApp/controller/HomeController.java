package com.security.springApp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/greetings")
public class HomeController {

    @GetMapping
    public ResponseEntity<String> sayHello(){

        return ResponseEntity.ok("Hello.......Welcome to home page!");
    }

    @GetMapping("/bye")
    public ResponseEntity<String> sayGoodbye(){

        return ResponseEntity.ok("Bye.....See you soon");
    }
}
