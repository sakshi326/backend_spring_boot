package com.vit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vit.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
