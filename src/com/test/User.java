package com.test;

public class User {
	private String name;
	private int age;
	private double money;
	private String no;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getMoney() {
		return money;
	}

	public String getNo() {
		return no;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public User(String name, double money, String no) {
		super();
		this.name = name;
		this.money = money;
		this.no = no;
	}

	public User(String name, int age, String no) {
		super();
		this.name = name;
		this.age = age;
		this.no = no;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", money=" + money
				+ ", no=" + no + "]";
	}
public void setAge(int age) {
	this.age = age;
}
}
