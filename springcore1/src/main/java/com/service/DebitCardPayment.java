package com.service;

public class DebitCardPayment implements IPayment{
	
	public void processPayment(double amount)
	{
		System.out.println("Payment processed by Debit Card with amount "+amount);
	}

}
