package com.oocl.web.sampleWebApp.controller;

import org.springframework.stereotype.Service;

@Service
public class User {
    private String id;
    public User(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User(String id){
        this.id = id;
    }
}
