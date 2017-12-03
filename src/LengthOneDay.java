
public class LengthOneDay implements RentLength {

	private String length;
	private double price;
	
	public LengthOneDay() {
		length = "One Day";
		price  = 24.00;
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
