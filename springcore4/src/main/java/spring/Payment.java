package spring;

public class Payment {
	
	MyInterface pay;
	
	public Payment()
	{
		System.out.println("IOC invoke payment class default constructor.");
	}
	
	public Payment(MyInterface pay)
	{
		System.out.println("IOC invoke payment class parameterized constructor.");
		this.pay=pay;
	}
	
	public void setDopayment(MyInterface pay)
	{
		System.out.println("Inside setter method");
		this.pay=pay;
		pay.doPayment();
	}

}
