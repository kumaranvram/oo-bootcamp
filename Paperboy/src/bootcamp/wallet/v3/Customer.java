package bootcamp.wallet.v3;

public class Customer {
	private Wallet wallet;
	public Wallet getWallet(){
		return wallet;
	}
	
	public double pay(double amount){
		return wallet.withdraw(amount);
	}	
}
