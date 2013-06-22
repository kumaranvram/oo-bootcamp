package bootcamp.wallet.v3;

public class Paperboy {
	private double collectedAmount;
		
	public void collectMoney(Customer customer, double dueAmount){
		collectedAmount = collectedAmount + customer.pay(dueAmount);
	}

	public double getCollectedAmount() {
		return collectedAmount;
	}	
}
