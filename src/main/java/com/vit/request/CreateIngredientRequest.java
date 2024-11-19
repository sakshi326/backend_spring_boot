package com.vit.request;

import lombok.Data;

@Data
public class CreateIngredientRequest {

    private Long restaurantId;
    private String name;
    private Long ingredientCategoryId;
}
