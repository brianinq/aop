package com.example.aopdemo;

import com.example.aopdemo.repository.AccountRepository;
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
    CommandLineRunner commandLineRunner(AccountRepository accountRepository){
        return runner ->{
          demoBeforeAdvice(accountRepository);
        };
    }

    private void demoBeforeAdvice(AccountRepository accountRepository) {
        accountRepository.addAccount();
    }


}
