public class StationWagon implements Car {
	private String name;
	private double price;

	StationWagon() {
		price = 200;
		name = "Station Wagon";
	}

	public String getType() {
		return name;
	}

	public double getPrice() {
		return price;
	}
}
