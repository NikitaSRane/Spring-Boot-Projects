package com.spring;

public class MyClass {
	
	MyInterface my;
	
	public MyClass()
	{
		System.out.println("IOC creates object of default constructor of MyClass class");
	}
	
//	public MyClass(MyInterface my)
//	{
//		this.my=my;
//		System.out.println("IOC creates object of parameterized constructor of MyClass class");
//
//	}
	
	public void setStart(MyInterface my)
	{
		System.out.println("dependency injected by setter injection");
		this.my=my;
		my.doTask();
	}
	
}
