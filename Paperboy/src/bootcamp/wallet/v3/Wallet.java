package bootcamp.wallet.v3;

public class Wallet {
	private double cash;

	public double withdraw(double amount){
    	if (amount > cash){
        	throw new RuntimeException("Insufficient funds!");    		
    	}
    	cash -= amount;
    	return amount;
	}
}
