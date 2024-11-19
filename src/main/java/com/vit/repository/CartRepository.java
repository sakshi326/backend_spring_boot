package com.vit.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vit.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

	 Optional<Cart> findByCustomer_Id(Long userId);
}
