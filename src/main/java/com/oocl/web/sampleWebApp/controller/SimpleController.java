package com.oocl.web.sampleWebApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.logging.Logger;

/**
 * Created by jxzhong on 18/08/2017.
 */
@RestController
@RequestMapping("/")
public class SimpleController {

    Users users;
    @Autowired
    public SimpleController(Users users){
        this.users = users;
    }

    private final Logger log = Logger.getLogger(this.getClass().getName());

    @GetMapping(path = "/", produces = {"application/json"})
    public ResponseEntity<String> getAll() {
        users.addUser("ABC");
        return ResponseEntity.ok("Hello: " + users.getUser("ABC"));
    }

    @PostMapping(path = "/users/{userID}", produces = {"application/json"})
    public ResponseEntity<String> postUser(@PathVariable String userID){
        users.addUser(userID);
        return ResponseEntity.created(URI.create("/users/" + userID)).body("Useless");
    }


}