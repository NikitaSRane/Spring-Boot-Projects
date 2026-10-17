package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
//		Manual object creation and dependency injection
		
//		MyInterface my=new Task2();
//		MyClass obj=new MyClass(my);
//		obj.start();
		
//		IOC implementation
		
		ApplicationContext app=new ClassPathXmlApplicationContext("myxml.xml");
		
		/*
		MyClass obj=(MyClass) app.getBean("test");
		obj.start();*/
		
	}

}
