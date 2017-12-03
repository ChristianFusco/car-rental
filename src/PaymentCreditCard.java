import java.util.Calendar;

public class PaymentCreditCard implements PaymentBehavior {
	private String ccNumber;
	private String name;
	private String ccv;
	private String expireDate;
	
	PaymentCreditCard(String ccNumber, String name,
					  String ccv, String expireDate) {
		this.ccNumber = ccNumber;
		this.name = name;
		this.ccv = ccv;
		this.expireDate = expireDate;
	}

	public void makePayment(double amount) {
		if(!validate()) {
			System.out.println("Transaction Canceled.");
			return;
		}
		System.out.println("Beep boop charged " + amount + 
						   " dollars on account " + name + ".");
	}

	public boolean validate() {
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		String today = year + "/" + month;
		if(expireDate.compareTo(today) > 0) {
			return true;
		}
		System.out.println("Card expired.");
		return false;
	}
}