package main;

public interface Currency {
	
	public abstract Double toBaseCurrencyValue();
	
	public static final Currency USD = new USDollar();
	public static final Currency EURO = new Euro();
	public static final Currency INR = new IndianRupee();	
}
