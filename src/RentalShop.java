public class RentalShop {

	public static void main(String[] args) {
		
		//Create factories
		CarFactory sedanFactory = new SedanFactory();
		CarFactory suvFactory = new SUVFactory();
		CarFactory stationWagonFactory = new StationWagonFactory();
		
		//New customer
		Customer bob = new Customer("Bob");
		System.out.println(bob.getName() + " entered the shop.");
		
		//Create new credit card for bob
		PaymentBehavior bobCreditCard = new PaymentCreditCard(
				"1111111111111111", bob.getName(), "123", "2018/07");
		bob.setPaymentBehavior(bobCreditCard);
		
		//Bob wants a sadan - we get from factory
		Car sedan = sedanFactory.makeCar();
		System.out.println("Current car build: " + sedan.getType());
		System.out.println("Current car price: " + sedan.getPrice());
		
		//Bob decorates car with heated seats and radio
		sedan = new HeatedSeats(sedan);
		sedan = new Radio(sedan);
		bob.rentCar(sedan);
		
		//Display new car and price
		System.out.println("New build: " + sedan.getType());
		System.out.println("New price: " + sedan.getPrice());
		
		//Bob rented for 2 hours
		bob.chooseRentLength(new LengthTwoHours());
		System.out.println(bob.getName() + " is driving...");
		
		//Returning car
		bob.returnCar();
		
	}
	
}