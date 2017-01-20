package com.test.collectic;

import java.util.List;

import com.test.User;

public class Manager {
	private String name;

	private List<User> users;

	public void setName(String name) {
		this.name = name;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Manager [name=" + name + ", users=" + users + "]";
	}
}
