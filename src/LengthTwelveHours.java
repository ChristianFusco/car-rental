
public class LengthTwelveHours implements RentLength {

	private String length;
	private double price;
	
	public LengthTwelveHours() {
		length = "12 Hours";
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
