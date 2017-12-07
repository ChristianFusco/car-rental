import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ProxyDiscount implements Discount {
	
	RealDiscount realDiscount;
	ArrayList<String> daysWithDiscount = new ArrayList<String>();
	
	ProxyDiscount(RealDiscount dis){
		this.realDiscount = dis;
		
		daysWithDiscount.add("Tuesday");
		daysWithDiscount.add("Thursday");
	}
	
	public double applyDiscount(double price) {
		
		//Get current day
		Date now = new Date();
		SimpleDateFormat day = new SimpleDateFormat("EEEE");
		String currentDate = day.format(now);

		//Apply discount if day in list
		if(daysWithDiscount.contains(currentDate)) {
			System.out.println("Congratulations, there is a discount on: " + currentDate);
			System.out.println("Original Price: " + price);
			return realDiscount.applyDiscount(price);
		}
		else {
			System.out.println("Sorry, no current discounts going on");
			return price;
		}
	}
}
