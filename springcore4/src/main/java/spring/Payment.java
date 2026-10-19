package spring;

public class Payment {
	
	MyInterface pay;
	
	public Payment()
	{
		System.out.println("IOC invoke payment class default constructor.");
	}
	
	public void setPay()
	{
		System.out.println("Inside setter method");
		pay.doPayment();
	}

}
