
public class LengthZero implements RentLength {

	private String length;
	private double price;
	
	public LengthZero() {
		length = "None";
		price  = 0.00;
	}
	
	@Override
	public String getLength() {
		return length;
	}

	@Override
	public double getPrice() {
		return price;
	}

}
