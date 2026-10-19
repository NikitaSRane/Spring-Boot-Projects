package spring;

public class CreditCard implements MyInterface{
	
	public CreditCard()
	{
		System.out.println("IOC invoke Creditcard class default constructor.");

	}
	
	public void doPayment()
	{
		System.out.println("Inside credit card do Payment method");
	}

}
