public class Customer {
	private String name;
	private PaymentBehavior paymentBehavior;
	private Car car;

	Customer(String name, PaymentBehavior paymentBehavior) {
		this.name = name;
		this.paymentBehavior = paymentBehavior;
		this.car = new NoCar();
	}

	public void makePayment(double amount) {
		paymentBehavior.makePayment(amount);
	}
	
	public void makePayment() {
		paymentBehavior.makePayment(car.getPrice());
	}
	
	public void rentCar(Car car) {
		this.car = car;
	}
	
	public void returnCar() {
		this.car = new NoCar();
	}
	
	/**
	* This is dumb but it'll stay in case mind change
	* 
    * Alt constructor that creates new PaymentBehavior.
    * Not case sensitive.
    * @param name - User name
    * @param paymentType - a String that holds the payment
    * 					   type.  Either PayPal or CreditCard
    * @return int This returns sum of numA and numB.
    */
	private Customer(String name, String paymentType) {
		this.name = name;
		if("paypal".equals(paymentType.toLowerCase())) {

		}
		else if ("creditcard".equals(paymentType.toLowerCase())) {

		}
		else {
			throw new RuntimeException("Payment type not found.");
		}
	}
}