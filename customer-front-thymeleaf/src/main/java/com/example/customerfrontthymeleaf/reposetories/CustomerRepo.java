package com.example.customerfrontthymeleaf.reposetories;

import com.example.customerfrontthymeleaf.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Long> {
}
