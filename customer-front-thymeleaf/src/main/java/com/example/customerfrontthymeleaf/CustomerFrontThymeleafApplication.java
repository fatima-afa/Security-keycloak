package com.example.customerfrontthymeleaf;

import com.example.customerfrontthymeleaf.entities.Customer;
import com.example.customerfrontthymeleaf.reposetories.CustomerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerFrontThymeleafApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerFrontThymeleafApplication.class, args);
    }
    @Bean
    CommandLineRunner start(CustomerRepo customerRepo){
        return args -> {
            customerRepo.save(Customer.builder().id(1L).email("fatima@gmail.com").name("fatima").build());
            customerRepo.save(Customer.builder().id(2L).email("afa@gmail.com").name("afa").build());
            customerRepo.save(Customer.builder().id(3L).email("hassan@gmail.com").name("hassan").build());
        };
    }
}
