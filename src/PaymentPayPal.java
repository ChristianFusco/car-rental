import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PaymentPayPal implements PaymentBehavior {
	private String userName;
	private String password;
	
	PaymentPayPal(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public void makePayment(double amount) {
		if(!validate()) {
			System.out.println("Transaction Canceled.");
			return;
		}
		System.out.println("Beep boop charged " + amount + 
						   " dollars on account " + userName + ".");
	}

	public boolean validate() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter password for account " + userName + ".");
		try{
			String input = br.readLine();
			if(password.equals(input)) {
				return true;
			}
		} catch (Exception e) {	  
	        System.err.println(e);
		}
		System.out.println("Login information incorrect.");
		return false;
	}
}