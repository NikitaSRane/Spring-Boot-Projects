
package com.service;

public class Test {

	public static void main(String[] args) {
		
		// field injection
		//PaymentService service=new PaymentService();
		//service.payment=new PhonePayPayment(); 
		//service.doPayment(4000.10);
		
		// constructor injection
		//IPayment payment=new DebitCardPayment();
		//PaymentService service=new PaymentService(payment);
		//service.doPayment(50000.213);
		 
		
		//Setter injection
		
		IPayment payment=new CreditCardPayment();
		PaymentService service=new PaymentService();
		service.service(payment);
		service.doPayment(1200.3);
		
		
	}

}
