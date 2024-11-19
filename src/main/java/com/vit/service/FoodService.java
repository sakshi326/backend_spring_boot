package com.vit.service;

import java.util.List;

import com.vit.Exception.FoodException;
import com.vit.Exception.RestaurantException;
import com.vit.model.Category;
import com.vit.model.Food;
import com.vit.model.Restaurant;
import com.vit.request.CreateFoodRequest;

public interface FoodService {

	public Food createFood(CreateFoodRequest req,Category category,
						   Restaurant restaurant) throws FoodException, RestaurantException;

	void deleteFood(Long foodId) throws FoodException;
	
	public List<Food> getRestaurantsFood(Long restaurantId,
			boolean isVegetarian, boolean isNonveg, boolean isSeasonal,String foodCategory) throws FoodException;
	
	public List<Food> searchFood(String keyword);
	
	public Food findFoodById(Long foodId) throws FoodException;

	public Food updateAvailibilityStatus(Long foodId) throws FoodException;
}
