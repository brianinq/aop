package com.example.aopdemo.repository.impl;

import com.example.aopdemo.repository.AccountRepository;
import com.example.aopdemo.repository.MembershipRepository;
import org.springframework.stereotype.Repository;

@Repository
public class MembershipRepositoryImpl implements MembershipRepository {
    @Override
    public void addAccount() {
        System.out.println(getClass() + "Adding Membership Account");
    }
}
