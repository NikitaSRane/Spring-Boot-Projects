package com.lifecycle;

public class LifeCycle {
	
	public void init()
	{
		System.out.println("getting Connection db...");
	}
	
	public void getData()
	{
		System.out.println("Getting data from database.");
	}

	public void destroy()
	{
		System.out.println("getting destroy db connection...");
	}
}
