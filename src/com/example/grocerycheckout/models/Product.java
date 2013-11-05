package com.example.grocerycheckout.models;

public class Product {
	private String barcode;
	private Double price;
	private String name;
	
	Product(String barcode, Double price, String name) {
		this.barcode = barcode;
		this.price = price;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
    public Double getPrice() {
		return price;
	}
}
