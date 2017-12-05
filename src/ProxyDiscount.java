public class ProxyDiscount implements Discount {
	
	RealDiscount realDiscount;
	
	ProxyDiscount(RealDiscount dis){
		this.realDiscount = dis;
	}
	
	public double applyDiscount(double price) {
		
		return realDiscount.applyDiscount(price);
	}
}
