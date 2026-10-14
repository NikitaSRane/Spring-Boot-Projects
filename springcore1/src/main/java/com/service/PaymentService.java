package com.service;

public class PaymentService {
	
	IPayment payment;
	
	/*
	
	public PaymentService(IPayment payment) // constructor 
	{
		this.payment=payment;
	}
	
	*/
	
	
	public void service(IPayment payment) //setter 
	{
		this.payment=payment;
	}	
	
	public void doPayment(double amount)
	{
		payment.processPayment(amount);
		
		System.out.println("Payment successfull");
	}
}
