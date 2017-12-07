public class Customer {
	private String name;
	private PaymentBehavior paymentBehavior;
	private Car car;
	private RentLength rentLength;
	private Discount discount;

	Customer(String name) {
		this.name = name;
		this.paymentBehavior = null;
		this.car = new NoCar();
		this.rentLength = new LengthZero();
		this.discount = new ProxyDiscount(new RealDiscount());
	}

	public String getName() {
		return name;
	}
	
	public void makePayment(double amount) {
		
		if(paymentBehavior != null) {
			paymentBehavior.makePayment(amount);
		}
		else {
			System.out.println("No payment behavior");
		}
	}
	
	public void makePayment() {
		
		if(paymentBehavior != null) {
		double price = car.getPrice() + rentLength.getPrice();
		
		System.out.println("***drove for " + rentLength.getLength());
		
		price = discount.applyDiscount(price);
		paymentBehavior.makePayment(price);
		
		}
		else {
			System.out.println("No payment behavior");
		}
	}
	
	public void rentCar(Car car) {
		this.car = car;
	}
	
	public void returnCar() {
		makePayment();
		this.car = new NoCar();
	}
	
	public void chooseRentLength(RentLength length) {
		this.rentLength = length;
	}
	
	public void setPaymentBehavior(PaymentBehavior behavior) {
		this.paymentBehavior = behavior;
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