package com.vit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vit.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
