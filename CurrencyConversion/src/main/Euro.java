package main;

public class Euro implements Currency {

	@Override
	public Double toBaseCurrencyValue() {
		return 80.0;
	}
	
	@Override
	public String toString() {
		return "EUR";
	}
}
