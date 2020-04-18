package com.example.demo.Controller;

import com.example.demo.Entity.Account;
import com.example.demo.Entity.User;
import com.example.demo.Service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
public class UserController {
    private final UserService repo;

    public UserController(UserService repo) {
        this.repo = repo;
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return repo.getAllUsers();
    }

    @RequestMapping("/users/{id}")
    public User getUser(@PathVariable Long id){
        return repo.getUserById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public User findByName(@RequestParam(value="name") String name){
        return repo.findByName(name);
    }

    @RequestMapping("/users/{id}/accounts")
    public Set<Account> getUserAccounts(@PathVariable Long id){
        User user = repo.getUserById(id);
        return repo.getUserAccounts(user);
    }
}
