package com.vit.service;

import com.stripe.exception.StripeException;
import com.vit.model.Order;
import com.vit.model.PaymentResponse;

public interface PaymentService {
	
	public PaymentResponse generatePaymentLink(Order order) throws StripeException;

}
