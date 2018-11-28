package com.oocl.web.sampleWebApp.controller;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Users {
    private List<User> users = new ArrayList<>();
    public Users(){}

    public Users(List<User> users ){
        this.users = users;
    }

    public List<User> getIds() {
        return users;
    }

    public void setId(List<User> users) {
        this.users = users;
    }

    public void addUser(String id){
        users.add(new User(id));
    }

    public User getUser(String id){
        return users.get(users.indexOf(id));
    }

}
