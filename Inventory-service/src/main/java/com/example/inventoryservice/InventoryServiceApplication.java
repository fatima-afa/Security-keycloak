package com.example.inventoryservice;

import com.example.inventoryservice.entities.Product;
import com.example.inventoryservice.repo.ProductRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ProductRepo productRepo){
        return args -> {
            productRepo.save(Product.builder()
                            .name("Computer")
                            .price(13000)
                            .id(UUID.randomUUID().toString())
                            .quantity(10)
                    .build());
            productRepo.save(Product.builder()
                            .name("Iphon 13")
                            .price(13000)
                            .id(UUID.randomUUID().toString())
                            .quantity(4)
                    .build());
            productRepo.save(Product.builder()
                            .name("printer")
                            .price(3000)
                            .id(UUID.randomUUID().toString())
                            .quantity(1)
                    .build());
        };
    }
}
