package com.test.annotation.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	public void add() {
		System.out.println("service add...");
	}
}
