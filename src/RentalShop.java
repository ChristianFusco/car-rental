public class RentalShop {

	public static void main(String[] args) {
		
		CarFactory sedanFactory = new SedanFactory();
		
		Car sedan = sedanFactory.makeCar();
		System.out.println(sedan.getType());
	}
	
}