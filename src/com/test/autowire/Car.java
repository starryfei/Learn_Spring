package com.test.autowire;

public class Car {
	private String name;
	private double price;

	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
public Car() {
System.out.println("constructor create....");
}
}
