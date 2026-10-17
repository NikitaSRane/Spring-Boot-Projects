package com.spring;

public class Task2 implements MyInterface{
	
	public Task2()
	{
		System.out.println("IOC creates object of default constructor of Task2 class");
	}
	public void doTask()
	{
		System.out.println("Task2 completed.");
	}
}
