package com.example.NguyenThanhSieu_9116.model;

import lombok.Data;


public class CartItem {
    private Product product;
    private int quantiy;


    public CartItem(Product product, int quantiy) {
        this.product = product;
        this.quantiy = quantiy;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantiy() {
        return quantiy;
    }

    public void setQuantiy(int quantiy) {
        this.quantiy = quantiy;
    }
}
