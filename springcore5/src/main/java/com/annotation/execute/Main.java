package com.annotation.execute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.annotation.AppConfig;
import com.annotation.Dao.ReportDao;
import com.annotation.component.Comp1;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Comp1 com= context.getBean(Comp1.class);
		com.generateReport();
	}

}
