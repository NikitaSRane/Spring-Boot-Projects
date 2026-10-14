package com.service;

public class PhonePayPayment implements IPayment
{
	public void processPayment(double amount)
	{
		System.out.println("Payment processed by Phonepay with amount "+amount);
	}
}
