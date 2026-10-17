package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
//		Manual object creation and dependency injection
		
//		MyInterface my=new Task2();
//		MyClass obj=new MyClass(my);
//		obj.start();
		
//		IOC implementation
		
		ApplicationContext app=new ClassPathXmlApplicationContext("myxml.xml");
		
		
//		invoke constructor injection
		
//		MyClass obj=(MyClass) app.getBean("test"); // typecasting
//		System.out.println("Hashcode of MyClass :"+obj.hashCode());
//
//		obj.start();
		
		
//		invoke setter injection  after invoke default constructor. no need to call for setter method separately.
//		ApplicationContext app=new ClassPathXmlApplicationContext("myxml.xml");
		
		
//		singleton scope = only creates one object
		
//		Task1 t1= (Task1) app.getBean("t1");
//		System.out.println("Hashcode of t1 :"+ t1.hashCode());
//		Task1 t2= (Task1) app.getBean("t1");
//		System.out.println("Hashcode of t1 :"+ t2.hashCode());
//		
//		if(t1 == t2)
//		{
//			System.out.println("Both reference points to same object as Singleton");
//		}
//		else
//		{
//			System.out.println("object as prototype");
//
//		}

		
//		prototype scope = multiple objects
				
//		Task2 pt1= (Task2) app.getBean("t2");
//		System.out.println("Hashcode of pt1 :"+ pt1.hashCode());
//		Task2 pt2= (Task2) app.getBean("t2");
//		System.out.println("Hashcode of pt2 :"+ pt2.hashCode());
//		
//		if(pt1 == pt2)
//		{
//			System.out.println("Both reference points to same object as Singleton");
//		}
//		else
//		{
//			System.out.println("Both references points to different object as prototype");
//
//		}

	
		
//		 creates two different beans of same class create different instance in memory 
		
//		Task1 bt1=(Task1) app.getBean("bt1");
//		System.out.println("Hashcode of bt1 :"+ bt1.hashCode());
//
//		Task1 bt2=(Task1) app.getBean("bt2");
//		System.out.println("Hashcode of bt2 :"+ bt2.hashCode());

		

		
	}

}
