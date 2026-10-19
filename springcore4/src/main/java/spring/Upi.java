package spring;

public class Upi implements MyInterface{
	
	public Upi()
	{
		System.out.println("IOC invoke upi class default constructor.");

	}
	
	public void doPayment()
	{
		System.out.println("Inside Upi do Payment method");
	}

}
