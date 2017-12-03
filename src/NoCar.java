
public class NoCar implements Car {

	private String name;
	private double price;
	
	NoCar(){
		price = 0.00;
		name = "None";
	}
	
	@Override
	public String getType() {
		return name;
	}

	@Override
	public double getPrice() {
		return price;
	}

}
