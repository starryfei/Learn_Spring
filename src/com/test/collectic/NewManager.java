package com.test.collectic;

import java.util.List;
import java.util.Map;

import javax.jws.soap.SOAPBinding.Use;

import com.test.User;

public class NewManager {
	private String name;

	private Map<String, User> users;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public NewManager() {
		// TODO Auto-generated constructor stub
	}

	public Map<String, User> getUsers() {
		return users;
	}

	public void setUsers(Map<String, User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "NewManager [name=" + name + ", users=" + users + "]";
	}

}
