public class LeatherSeats extends CarDecorator {
	LeatherSeats(Car decoratedCar) {
		super(decoratedCar);
		name = "Leather Seats";
		price = 10;
	}

	public double getPrice() {
		return decoratedCar.getPrice() + price;
	}
	
	public String getType() {
		return decoratedCar.getType() + " with " + name;
	}
}