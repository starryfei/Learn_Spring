package com.test.cycle;

public class User {

	public User() {
		System.out.println("User's Constructor...");
	}

	private String name;

	public void setName(String name) {
		System.out.println("setName..");
		this.name = name;
	}

	private void init() {
		// TODO Auto-generated method stub
		System.out.println("init mothod..");
	}

	private void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy method... ");
	}

	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}
}
