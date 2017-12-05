public class SUV implements Car {
	private String name;
	private double price;

	SUV() {
		price = 200;
		name = "Sports Utility Vehicle";
	}

	public String getType() {
		return name;
	}

	public double getPrice() {
		return price;
	}
}
