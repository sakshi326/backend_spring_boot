package com.vit.request;

import com.vit.model.Address;

import lombok.Data;

@Data
public class CreateOrderRequest {
 
	private Long restaurantId;
	
	private Address deliveryAddress;
	
    
}
