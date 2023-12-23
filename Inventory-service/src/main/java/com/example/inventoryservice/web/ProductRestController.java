package com.example.inventoryservice.web;

import com.example.inventoryservice.entities.Product;
import com.example.inventoryservice.repo.ProductRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductRestController {
    private final ProductRepo productRepo;

    @GetMapping("/products")
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public List<Product> products(){
        return productRepo.findAll();
    }
}
