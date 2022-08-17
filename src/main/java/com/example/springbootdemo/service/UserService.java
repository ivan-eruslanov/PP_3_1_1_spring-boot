package com.example.springbootdemo.service;

import com.example.springbootdemo.model.User;

import java.util.List;

public interface UserService {
    User getUserById(Long id);
    List<User> getAllUsers();
    void saveUser(User user);
    void deleteUserById(Long id);
}
