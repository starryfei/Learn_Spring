package com.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.HelloSpring;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 HelloSpring j = new HelloSpring();
		 j.setName("fei");*/
		 /*
		  * 创建对象和赋值可以交给spring来完成
		  */
//		 j.Hello();
		 //创建spring IOC容器对象，
		//ApplicationContext IOC容器
		//ClassPathXmlApplicationContext:是ApplicationContext接口实现类，该实现从类路径下来加载配置文件
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		 
		 
		 //从IOC容器获取bean实例
		 //利用id定位到IOC容器的bean
		 HelloSpring hello = (HelloSpring) ctx.getBean("helloSpring");
         //利用类型获取
		 //		HelloSpring hello = ctx.getBean(HelloSpring.class);
		// 调用类的方法
         hello.Hello();
         
         User use = (User) ctx.getBean("user");
         System.out.println(use);
        use = (User) ctx.getBean("user2");
         System.out.println(use);
Manager manager = (Manager) ctx.getBean("manager");
System.out.println(manager);
	}

}
