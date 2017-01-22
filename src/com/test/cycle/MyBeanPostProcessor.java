package com.test.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {

		// 添加过滤
		if ("user".equals(beanName)) {
			System.out.println("postProcessBeforeInitialization: " + bean
					+ " ， " + beanName);
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("postProcessAfterInitialization: " + bean + " , "
				+ beanName);
		// 在方法中修改返回的bean
		User user = new User();
		user.setName("qin");
		return user;
	}

}
