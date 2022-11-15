package com.example.javaapipractice.service;


import com.example.javaapipractice.models.User;
import com.example.javaapipractice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceAPI implements UserService{

    @Autowired
    private UserRepository userDao;


    @Override
    public User saveUser(User user) {
        return userDao.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.findAll();
    }

    @Override
    public void deleteUser(User user) {
        userDao.delete(user);
    }

    @Override
    public Optional<User> getOneUser(long id) {
        return userDao.findById(id);
    }
}
