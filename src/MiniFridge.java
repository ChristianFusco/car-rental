public class MiniFridge extends CarDecorator {
	MiniFridge(Car decoratedCar) {
		super(decoratedCar);
		name = "Mini Fridge";
		price = 80;
	}

	public double getPrice() {
		return decoratedCar.getPrice() + price;
	}
	
	public String getType() {
		return decoratedCar.getType() + " with " + name;
	}
}