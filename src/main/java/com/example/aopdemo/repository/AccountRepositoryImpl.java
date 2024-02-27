package com.example.aopdemo.repository;

import org.springframework.stereotype.Repository;

@Repository
public class AccountRepositoryImpl implements AccountRepository{
    @Override
    public void addAccount() {
        System.out.println(getClass() + "Adding Account");
    }
}
