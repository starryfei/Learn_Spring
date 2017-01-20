package com.test;

public class Manager {
	private String name;
	private User user;

	public void setName(String name) {
		this.name = name;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Manager [name=" + name + ",  user=" + user + "]";
	}

}
