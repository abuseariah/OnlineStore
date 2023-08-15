package com.example.onlinestore.repository;

import com.example.onlinestore.models.Cart;
import com.example.onlinestore.models.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
        void addToCart(Cart cart, CartItem cartItem);

        void removeFromCart(Cart cart, CartItem cartItem);


        }