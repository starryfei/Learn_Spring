package com.test.cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.autowire.Address;
import com.test.autowire.Person;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"cycle.xml");
		User user = (User) ctx.getBean("user");
		System.out.println(user);
		// 关闭IOC容器
		ctx.close();
	}
}
