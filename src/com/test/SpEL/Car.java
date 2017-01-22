package com.test.SpEL;

public class Car {
	private String name;
	private double price;
	// 轮胎的周长
	private double tyrePerimeter;

	public double getTyrePerimeter() {
		return tyrePerimeter;
	}

	public void setTyrePerimeter(double tyrePerimeter) {
		this.tyrePerimeter = tyrePerimeter;
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

	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + ", tyrePerimeter="
				+ tyrePerimeter + "]";
	}
}