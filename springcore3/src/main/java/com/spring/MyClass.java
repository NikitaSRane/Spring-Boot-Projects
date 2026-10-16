package com.spring;

public class MyClass {
	
	MyInterface my;
	
	public MyClass(MyInterface my)
	{
		this.my=my;
	}
	
	public void start()
	{
		my.doTask();
	}
	
}
