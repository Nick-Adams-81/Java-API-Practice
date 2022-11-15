package com.example.javaapipractice.controllers;


import com.example.javaapipractice.models.User;

import com.example.javaapipractice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/getUsers")
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/getUsers/{id}")
    public Optional<User> getOneUser(@PathVariable long id) {
        return userService.getOneUser(id);
    }

    @PostMapping("/saveUser")
    public String saveUser(@RequestBody User user) {
        userService.saveUser(user);
        return "New user Added!";
    }



}
