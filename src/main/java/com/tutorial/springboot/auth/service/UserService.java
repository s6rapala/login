package com.tutorial.springboot.auth.service;

import com.tutorial.springboot.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
