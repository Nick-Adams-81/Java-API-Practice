package com.example.javaapipractice.service;

import com.example.javaapipractice.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User saveUser(User user);

    List<User> getAllUsers();

    void deleteUser(User id);

    Optional<User> getOneUser(long id);
}
