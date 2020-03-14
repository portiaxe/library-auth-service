package com.portiaxe.controller;

import com.portiaxe.model.auth.User;
import com.portiaxe.service.AccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/account")
@RestController
public class AccessController {

    @Autowired
    private AccessService accessService;

    @PostMapping(path ="/login", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> login(@RequestBody User user){
        return ResponseEntity.ok(null);
    }

    @PostMapping(path ="/register", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> register(@RequestBody User user){
        return ResponseEntity.ok(null);
    }

    @PostMapping(path ="/unlock", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> unlockUser(@RequestBody User user){
        return ResponseEntity.ok(null);
    }

    @PostMapping(path ="/lock", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> lockUser(@RequestBody User user){
        return ResponseEntity.ok(null);
    }
}
