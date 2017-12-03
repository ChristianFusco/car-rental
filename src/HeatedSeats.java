public class HeatedSeats extends CarDecorator {
	HeatedSeats(Car decoratedCar) {
		super(decoratedCar);
		name = "Heated Seats";
		price = 20;
	}

	public double getPrice() {
		return decoratedCar.getPrice() + price;
	}
}