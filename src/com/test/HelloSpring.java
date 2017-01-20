package com.test;

public class HelloSpring {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setname= " + name);
		this.name = name;
	}

	public void Hello() {
		System.out.println("hello" + name);
	}

	public HelloSpring() {
		// TODO Auto-generated constructor stub
		System.out.println("constructor start。。。。 ");
	}
}
