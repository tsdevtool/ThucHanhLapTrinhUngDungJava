package com.example.NguyenThanhSieu_9116.repository;

import com.example.NguyenThanhSieu_9116.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
