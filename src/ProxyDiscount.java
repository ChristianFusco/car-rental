public class ProxyDiscount implements Discount {
	
	RealDiscount realDiscount;
	
	ProxyDiscount(RealDiscount dis){
		this.realDiscount = dis;
	}
	
	public double applyDiscount(double price) {
		
		//if discount
		//return realDiscount.applyDiscount(price);
		
		//else no discount
		System.out.println("Sorry, no current discounts going on");
		return price;
	}
}
