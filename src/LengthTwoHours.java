
public class LengthTwoHours implements RentLength {

	private String length;
	private double price;
	
	public LengthTwoHours() {
		length = "2 Hours";
		price  = 12.00;
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
