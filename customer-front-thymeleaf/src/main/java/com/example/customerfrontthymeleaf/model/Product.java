package com.example.customerfrontthymeleaf.model;

import lombok.*;


@AllArgsConstructor @NoArgsConstructor @Builder @Getter @Setter
public class Product {

    private String id;
    private String name;
    private double price;
    private int quantity;
}
