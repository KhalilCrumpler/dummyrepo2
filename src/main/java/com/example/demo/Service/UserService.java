package com.example.demo.Service;

import com.example.demo.Entity.Account;
import com.example.demo.Entity.User;
import com.example.demo.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public List<User> getAllUsers() {
        List<User> allUsers = new ArrayList<>();
        userRepo.findAll()
                .forEach(allUsers::add);
        return allUsers;
    }

    public User getUserById(Long id) {
        return userRepo.findById(id).get();
    }

    public User createUser(User user){
        return userRepo.save(user);
    }

    public void deleteUser(User user){
        userRepo.delete(user);
    }

    public User findByName(String name){
        return userRepo.findByEmail(name);
    }
}
