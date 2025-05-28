package com.hquiz.backend.service;

import com.hquiz.backend.model.Users;

import java.util.List;

public interface UsersService {
    String createUser(Users user);
    String loginUser (Users user);
    List<Users> getUsers();
    Long getIdFromUserName(String username);
}
