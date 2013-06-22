package bootcamp.wallet.v2;

public class Customer {
	private Wallet wallet;
	public Wallet getWallet(){
		return wallet;
	}
	
	public double getCash(){
		return wallet.getCash();
	}

	public void setCash(double amount) {
		wallet.setCash(amount);		
	}
	
	public boolean payCash(double amount){
		if(getCash() > amount){
			setCash(getCash()-amount);
			return true;
		}
		return false;
		}
			
		
	}

