package com.spring;

public class Task1 implements MyInterface{
	
	public Task1()
	{
		System.out.println("IOC creates object of default constructor of Task1 class");
	}
	public void doTask()
	{
		System.out.println("Task1 completed.");
	}
}
