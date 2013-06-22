package main;

public class USDollar implements Currency {

	@Override
	public Double toBaseCurrencyValue() {
		return 60.0;
	}
	
	@Override
	public String toString() {
		return "USD";
	}

}
