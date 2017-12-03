public class Radio extends CarDecorator {
	Radio(Car decoratedCar) {
		super(decoratedCar);
		name = "Radio";
		price = 5;
	}

	public double getPrice() {
		return decoratedCar.getPrice() + price;
	}
	
	public String getType() {
		return decoratedCar.getType() + " with " + name;
	}
}