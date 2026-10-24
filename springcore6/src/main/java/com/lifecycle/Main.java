package com.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml"); // ioc started
		
		LifeCycle cycle= context.getBean(LifeCycle.class); // access bean
		
		cycle.getData(); // call business logic method
		
		ConfigurableApplicationContext ccontext=(ConfigurableApplicationContext) context;  // need for destroy bean
		ccontext.close(); // calling destroying method
		
	}

}
