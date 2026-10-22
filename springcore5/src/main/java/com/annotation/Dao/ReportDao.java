package com.annotation.Dao;

import org.springframework.stereotype.Repository;

@Repository
public class ReportDao {

	public ReportDao()
	{
		System.out.println("Inside default ReportDao constructor");
	}
}
