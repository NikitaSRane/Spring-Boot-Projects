package com.spring;

public class Main {

	public static void main(String[] args) {
		MyInterface my=new Task2();
		MyClass obj=new MyClass(my);
		obj.start();

	}

}
