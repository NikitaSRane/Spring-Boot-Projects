package com.annotation.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.annotation.MyInterface;

@Repository("dao")
public class ReportDao implements MyInterface{

	
	public ReportDao()
	{
		System.out.println("Inside default ReportDao constructor");
	}
	
	@Override
	public void getReport() {

		System.out.println("Getting report by ReportDao");
		
	}
}
