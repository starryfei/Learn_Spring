package com.test.collectic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Manager manager = (Manager) ctx.getBean("manager3");
		System.out.println(manager);
		NewManager newManager = (NewManager) ctx.getBean("newManager");
		System.out.println(newManager);
		Connect connect = (Connect) ctx.getBean("connect");
		System.out.println(connect);
	}

}
