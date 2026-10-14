package com.service;

public class CreditCardPayment implements IPayment {
	
	public void processPayment(double amount)
	{
		System.out.println("Payment processed by credit card with amount "+amount);
	}

}
