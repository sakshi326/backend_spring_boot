package com.vit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vit.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
