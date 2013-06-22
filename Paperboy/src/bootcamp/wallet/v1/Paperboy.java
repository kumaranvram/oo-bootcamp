package bootcamp.wallet.v1;

public class Paperboy {
	private double collectedAmount;
	public void collectMoney(Customer customer, double dueAmount){
		if(customer.getWallet().getCash() < dueAmount)
	      throw new RuntimeException("Insufficient funds!");
	    else{
		    customer.getWallet().setCash(customer.getWallet().getCash() - dueAmount);
		    collectedAmount += dueAmount;	    	
	    }
	}
	
	public double getCollectedAmount() {
		return collectedAmount;
	}
}
