package com.example.grocerycheckout.models;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CartItem {
	private Product product;
	private int quantity;
	
	CartItem(Product p, int q) {
		product = p;
		quantity = q;
	}
	
	public Double getPrice() {
		return quantity * product.getPrice();
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public static List<CartItem> getStaticCartList() {
		List<CartItem> cartItems = new ArrayList<CartItem>();
		List<Product> products = new ArrayList<Product>(
				Arrays.asList( new Product("barCode1", 10.00, "Garnier Shampoo"),
				new Product("barCode2", 12.00, "Garnier Conditioner"),
				new Product("barCode3", 15.00, "Dove Shampoo"))
				);
		for (Product p: products) {
			cartItems.add(new CartItem(p, 2));
		}
		return cartItems;
	}
}
