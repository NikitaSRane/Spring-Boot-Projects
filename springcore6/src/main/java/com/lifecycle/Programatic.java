package com.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Programatic implements InitializingBean, DisposableBean {
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Getting connection db..");
		
	}
	
	public void getData()
	{
		System.out.println("Getting data from database.");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Getting destroy db connection....");
		
	}
}
