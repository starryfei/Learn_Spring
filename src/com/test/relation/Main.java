package com.test.relation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.autowire.Address;
import com.test.autowire.Person;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"relation.xml");
		Address address = (Address) ctx.getBean("address2");
		System.out.println(address);
		Person person = (Person) ctx.getBean("person");
		System.out.println(person);
	}
}
