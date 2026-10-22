package com.annotation.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.annotation.MyInterface;

@Component
public class Comp1 {
	
	
	public Comp1()
	{
		System.out.println("Inside comp1 default constructor.");
	}
	
	
//	@Qualifier("con")
	MyInterface my;

	@Autowired
	public Comp1(MyInterface my)
	{
		this.my=my;
		System.out.println("Inside comp1 pararm constructor.");
	}

	public void generateReport()
	{
		my.getReport();
	}

}
