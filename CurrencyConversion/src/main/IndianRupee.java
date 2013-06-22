package main;

public class IndianRupee implements Currency {

	
	@Override
	public Double toBaseCurrencyValue() {
		return 1.0;
	}
	
	@Override 
	public String toString() {
		return "INR";
	}
}
