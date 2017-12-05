public class GPS extends CarDecorator {
	GPS(Car decoratedCar) {
		super(decoratedCar);
		name = "GPS";
		price = 15;
	}

	public double getPrice() {
		return decoratedCar.getPrice() + price;
	}
	
	public String getType() {
		return decoratedCar.getType() + " with " + name;
	}
}