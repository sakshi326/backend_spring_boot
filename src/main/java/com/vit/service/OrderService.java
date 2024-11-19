package com.vit.service;

import java.util.List;

import com.stripe.exception.StripeException;
import com.vit.Exception.CartException;
import com.vit.Exception.OrderException;
import com.vit.Exception.RestaurantException;
import com.vit.Exception.UserException;
import com.vit.model.Order;
import com.vit.model.PaymentResponse;
import com.vit.model.User;
import com.vit.request.CreateOrderRequest;

public interface OrderService {
	
	 public PaymentResponse createOrder(CreateOrderRequest order, User user) throws UserException, RestaurantException, CartException, StripeException;
	 
	 public Order updateOrder(Long orderId, String orderStatus) throws OrderException;
	 
	 public void cancelOrder(Long orderId) throws OrderException;
	 
	 public List<Order> getUserOrders(Long userId) throws OrderException;
	 
	 public List<Order> getOrdersOfRestaurant(Long restaurantId,String orderStatus) throws OrderException, RestaurantException;
	 

}
