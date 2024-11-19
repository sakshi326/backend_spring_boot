package com.vit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vit.model.Events;

public interface EventRepository extends JpaRepository<Events, Long>{

	public List<Events> findEventsByRestaurantId(Long id);
}
