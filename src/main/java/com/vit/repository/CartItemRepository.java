package com.vit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vit.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


//    CartItem findByFoodIsContaining

}
