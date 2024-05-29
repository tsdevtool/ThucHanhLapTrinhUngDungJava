package com.example.NguyenThanhSieu_9116.repository;

import com.example.NguyenThanhSieu_9116.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
