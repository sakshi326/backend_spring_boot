package com.vit.service;

import java.util.List;

import com.vit.model.Notification;
import com.vit.model.Order;
import com.vit.model.Restaurant;
import com.vit.model.User;

public interface NotificationService {
	
	public Notification sendOrderStatusNotification(Order order);
	public void sendRestaurantNotification(Restaurant restaurant, String message);
	public void sendPromotionalNotification(User user, String message);
	
	public List<Notification> findUsersNotification(Long userId);

}
