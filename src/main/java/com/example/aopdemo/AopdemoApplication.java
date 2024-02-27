package com.example.aopdemo;

import com.example.aopdemo.repository.AccountRepository;
import com.example.aopdemo.repository.MembershipRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AopdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AopdemoApplication.class, args);

    }

    @Bean
    CommandLineRunner commandLineRunner(AccountRepository accountRepository, MembershipRepository membershipRepository){
        return runner ->{
          demoBeforeAdvice(accountRepository, membershipRepository);
        };
    }

    private void demoBeforeAdvice(AccountRepository accountRepository, MembershipRepository membershipRepository) {
        accountRepository.addAccount();
        membershipRepository.addAccount();
    }


}
