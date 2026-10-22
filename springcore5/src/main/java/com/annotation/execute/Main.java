package com.annotation.execute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.annotation.AppConfig;
import com.annotation.Dao.ReportDao;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		
		ReportDao dao=context.getBean(ReportDao.class);
		System.out.println(dao.hashCode());
	}

}
