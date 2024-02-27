package com.example.aopdemo.repository.impl;

import com.example.aopdemo.entity.Account;
import com.example.aopdemo.repository.AccountRepository;
import org.springframework.stereotype.Repository;

@Repository
public class AccountRepositoryImpl implements AccountRepository {
    @Override
    public void addAccount(Account account) {
        System.out.println(account.getClass() + "Adding Account" + account.getName());
    }
}
