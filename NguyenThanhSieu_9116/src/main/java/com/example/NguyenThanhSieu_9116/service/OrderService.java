package com.example.NguyenThanhSieu_9116.service;

import com.example.NguyenThanhSieu_9116.model.CartItem;
import com.example.NguyenThanhSieu_9116.model.Order;
import com.example.NguyenThanhSieu_9116.model.OrderDetail;
import com.example.NguyenThanhSieu_9116.model.Product;
import com.example.NguyenThanhSieu_9116.repository.OrderDetailRepository;
import com.example.NguyenThanhSieu_9116.repository.OrderRepository;
import com.example.NguyenThanhSieu_9116.repository.ProductRepository;
import groovy.transform.AutoImplement;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
@Transactional
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private OrderDetailRepository orderDetailRepository;
    @Autowired
    private CartService cartService;
    @Autowired
    private ProductRepository productRepository;

    @Transactional
    public Order createOrder(String customerName,String numberPhone, String email,String Address, String note, List<CartItem> cartItems){
        Order order = new Order();
        order.setCustomerName(customerName);
        order.setNumberPhone(numberPhone);
        order.setEmail(email);
        order.setAddressShip(Address);
        order.setDescription(note);
        order = orderRepository.save(order);

        for(CartItem item:cartItems){
            Product product = item.getProduct();
            if(product.getQuantity() < item.getQuantity())
                    throw new IllegalArgumentException("Not enough stock available for product" + product.getName());


            product.setQuantity(product.getQuantity() - item.getQuantity());
            productRepository.save(product);

            OrderDetail detail = new OrderDetail();
            detail.setOrder(order);
            detail.setProduct(item.getProduct());
            detail.setQuantity(item.getQuantity());
            orderDetailRepository.save(detail);
        }
        cartService.clearCart();
        return order;
    }
}
