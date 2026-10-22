package com.annotation.controller;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

import com.annotation.MyInterface;


@Controller("con")
public class ReportController implements MyInterface{
	
	public ReportController()
	{
		System.out.println("Inside default Report controller constructor");
	}
	
	@Override
	public void getReport() {

		System.out.println("Getting report by ReportController");
		
	}
}
