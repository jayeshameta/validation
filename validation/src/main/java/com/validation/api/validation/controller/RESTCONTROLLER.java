package com.validation.api.validation.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RESTCONTROLLER {
	
    @PostMapping("/validateData")
    public ResponseEntity<String> validate() { 
        return ResponseEntity.ok("Valid request");
    }
    
}
