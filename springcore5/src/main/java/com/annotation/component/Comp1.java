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
	
//	field injection // @Primary and @Qualifier allowed
//	@Qualifier("con")
	MyInterface my;

	
//	constructor injection 
//	@Autowired // @Primary allowed only
//	public Comp1(MyInterface my)
//	{
//		this.my=my;
//		System.out.println("Inside comp1 pararm constructor.");
//	}

//	setter injection
	
	@Autowired // @Primary and @Qualifier allowed in setter
	public void setReport(MyInterface my)
	{
		this.my=my;
	}
	
	
	public void generateReport()
	{
		my.getReport();
	}

}
