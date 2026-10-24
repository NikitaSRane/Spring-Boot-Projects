package com.lifecycle;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

// this call is for xml- based bean lifecycle

@Component
public class LifeCycle {
	
	@PostConstruct
	public void init()
	{
		System.out.println("getting Connection db...");
	}
	
	public void getData()
	{
		System.out.println("Getting data from database.");
	}

	@PreDestroy
	public void destroy()
	{
		System.out.println("getting destroy db connection...");
	}
}
