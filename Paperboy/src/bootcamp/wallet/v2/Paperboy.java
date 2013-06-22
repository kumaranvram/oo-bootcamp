package bootcamp.wallet.v2;

public class Paperboy {
	private double collectedAmount;
		
	public void collectMoney(Customer customer, double dueAmount){
		customer.payCash(dueAmount);
	      throw new RuntimeException("Insufficient funds!");
	    else{
		    customer.setCash(customer.getCash() - dueAmount);
		    collectedAmount = collectedAmount + dueAmount;	    	
	    }
	}
	public double getCollectedAmount() {
		return collectedAmount;
	}
}
