package com.xworkz.cooler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Refrigerator {

//	@Value("LG")
	private String brand;

//	@Value("40000.0")
	private double price;

	public Refrigerator() {
		System.out.println("Invoked default Constructor");
		System.out.println(this.getClass().getSimpleName() + " Object created");
	}

//	public Refrigerator(@Value("Godrej") String brand, @Value("50000.0") double price) {
//		super();
//		this.brand = brand;
//		this.price = price;
//	}

	public void cooling() {
		System.out.println("It will cool the water");
	}

	public String getBrand() {
		return brand;
	}

	@Value("Whirlpool")
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	@Value("60000.0")
	public void setPrice(double price) {
		this.price = price;
	}

}
