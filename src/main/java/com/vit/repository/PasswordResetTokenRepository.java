package com.vit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vit.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}
