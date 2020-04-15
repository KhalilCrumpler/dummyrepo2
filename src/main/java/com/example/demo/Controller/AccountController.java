package com.example.demo.Controller;

import com.example.demo.Entity.Account;
import com.example.demo.Service.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {
    private final AccountService repo;

    public AccountController(AccountService repo) {
        this.repo = repo;
    }

    @GetMapping("/accounts")
    public List<Account> getAllAccounts(){
        return repo.getAllAccounts();
    }
}
