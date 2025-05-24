package com.hquiz.backend.controller;

import com.hquiz.backend.model.Users;
import com.hquiz.backend.service.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    //Service Class
    @Autowired
    UsersServiceImpl usersService;

    //Creating User
    @PostMapping("/signup")
    public String createUser(@RequestBody Users user){
        return usersService.createUser(user);
    }

    @PostMapping("/login")
    public String loginUser(@RequestBody Users user){
        return usersService.loginUser(user);
    }

    @GetMapping("/")
    public List<Users> getUsers(){
        return usersService.getUsers();
    }

}
