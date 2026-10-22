package com.annotation.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.annotation.MyInterface;

@Service("service")
public class ReportService implements MyInterface {
	
	
	public ReportService()
	{
		System.out.println("Inside default report service constructor");
	}
	
	
	
	@Override
	public void getReport() {

		System.out.println("Getting report by ReportService");
		
	}
}
