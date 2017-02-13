package com.test.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.annotation.controller.UserController;
import com.test.annotation.respository.RespositoryIml;
import com.test.annotation.service.UserService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"annotation.xml");
		TestObject ts = (TestObject) ctx.getBean("testObject");
		System.out.println(ts);

		RespositoryIml res = (RespositoryIml) ctx.getBean("respository");
		System.out.println(res);
	   
		UserController userController = (UserController) ctx.getBean("userController");
		System.out.println(userController);
		
		UserService userService = (UserService) ctx.getBean("userService");
		System.out.println(userService);
		
	}

}
