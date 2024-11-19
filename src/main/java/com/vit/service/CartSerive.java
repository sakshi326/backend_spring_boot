package com.vit.service;

import com.vit.Exception.CartException;
import com.vit.Exception.CartItemException;
import com.vit.Exception.FoodException;
import com.vit.Exception.UserException;
import com.vit.model.Cart;
import com.vit.model.CartItem;
import com.vit.request.AddCartItemRequest;

public interface CartSerive {

	public CartItem addItemToCart(AddCartItemRequest req, String jwt) throws UserException, FoodException, CartException, CartItemException;

	public CartItem updateCartItemQuantity(Long cartItemId,int quantity) throws CartItemException;

	public Cart removeItemFromCart(Long cartItemId, String jwt) throws UserException, CartException, CartItemException;

	public Long calculateCartTotals(Cart cart) throws UserException;
	
	public Cart findCartById(Long id) throws CartException;
	
	public Cart findCartByUserId(Long userId) throws CartException, UserException;
	
	public Cart clearCart(Long userId) throws CartException, UserException;
	

	

}
