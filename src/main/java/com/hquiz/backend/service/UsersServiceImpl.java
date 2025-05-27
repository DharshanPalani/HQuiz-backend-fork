package com.hquiz.backend.service;

import com.hquiz.backend.model.Users;
import com.hquiz.backend.repository.UsersRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UsersServiceImpl implements UsersService{
    @Autowired
    private UsersRepository usersRepository;
    @Override
    public String createUser(@Valid Users user) {
        try{
            Optional<Users> existingUser = usersRepository.findByUsername(user.getUsername());
            if(existingUser.isPresent()) return "Username already Exists,Choose another unique username";
        Users createdUser = usersRepository.save(user);
        if(createdUser.getUsername().isEmpty() || createdUser.getPassword().isEmpty()){
            usersRepository.delete(user);
            return "Enter all Credentials,Signup Failed";
        }
        if(createdUser.getUsername().isBlank() || createdUser.getPassword().isBlank()){
            usersRepository.delete(user);
            return "Enter all Credentials,Signup Failed";
        }}
        catch (Exception e){
            return e.getMessage();
        }
        return "New User Created \n";
    }

    @Override
    public String loginUser(Users user) {
        Optional<Users> expectedUser = usersRepository.findByUsername(user.getUsername());
        if(expectedUser.isEmpty()){
            return "Invalid Credentials";
        }
        if(!(user.getPassword().equals(expectedUser.get().getPassword()))){
            return "Invalid Credentials.";
        }
        return "Welcome to HQuiz";
    }

    @Override
    public List<Users> getUsers(){
        return usersRepository.findAll();
    }

    @Override
    public Long getIdFromUserName(String username) {
        
        Optional<Users> expectedUser = usersRepository.findByUsername(username);
        if(expectedUser.isPresent()) return expectedUser.get().getId();
        return -1L;
    }
}
