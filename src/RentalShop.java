public class RentalShop {

	public static void main(String[] args) {
		
	//Factory Test
		CarFactory sedanFactory = new SedanFactory();
		
		Car sedan = sedanFactory.makeCar();
		System.out.println(sedan.getType());

	//Decorator Test
		System.out.println("Sedan Price: " + sedan.getPrice());
		sedan = new HeatedSeats(sedan);
		System.out.println("Added heated seats\nSedan Price: " + sedan.getPrice());
		sedan = new Radio(sedan);
		System.out.println("Added radio\nSedan Price: " + sedan.getPrice());
		
	//Behavior Test
		PaymentBehavior paymentBehavior = new PaymentCreditCard(
			"1111111111111111", "Testname", "123", "2018/07");
		Customer customer = new Customer("Testname", paymentBehavior);
		customer.makePayment(700);
		//This one fails.
		paymentBehavior = new PaymentCreditCard(
			"1111111111111111", "FailGuy", "123", "2017/11");
		customer = new Customer("FailGuy", paymentBehavior);
		customer.makePayment(700);
		//Paypal
		paymentBehavior = new PaymentPayPal("hi", "hi");
		customer = new Customer("Passguy", paymentBehavior);
		customer.makePayment(700);
		//This one fails.
		paymentBehavior = new PaymentPayPal("hi", "");
		customer = new Customer("FailGuy", paymentBehavior);
		customer.makePayment(700);
	}
	
}