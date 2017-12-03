public class Sedan implements Car {
	private String name;
	private double price;

	Sedan() {
		price = 200;
		name = "Sedan";
	}

	public String getType() {
		return name;
	}

	public double getPrice() {
		return price;
	}
}
