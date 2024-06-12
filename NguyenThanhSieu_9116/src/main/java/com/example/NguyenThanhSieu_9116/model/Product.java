package com.example.NguyenThanhSieu_9116.model;

import javax.annotation.processing.Generated;
import jakarta.persistence.*;
import lombok.*;
@Setter
@Getter
@RequiredArgsConstructor
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;
    private String description;
    private String image;

    @ManyToOne
    @JoinColumn(name = "category id")
    private Category category;
}
