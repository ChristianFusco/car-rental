public abstract class CarDecorator implements Car {
	double price;
	String name;
	Car decoratedCar;

	public CarDecorator(Car decoratedCar) {
		this.decoratedCar = decoratedCar;
	}

	public abstract double getPrice();

	public String getType() {
		return name;
	}
}