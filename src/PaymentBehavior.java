public interface PaymentBehavior {
	public void makePayment(int amount);
	public boolean validate();
}