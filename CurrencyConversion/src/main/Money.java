package main;

public class Money {
	Double amount;
	Currency currency;
	
	public Money(Double amount, Currency currency) {
		this.amount = amount;
		this.currency = currency;
	}
	
	public Money toUSDollars() {
		return convertTo(Currency.USD); 
	}
	
	public Money toEuros() {
		return convertTo(Currency.EURO);
	}
	
	public Money toIndianRupee() {
		return convertTo(Currency.INR);
	}
	
	private Money convertTo(Currency targetCurrency) {
		double baseValue = currency.toBaseCurrencyValue();
		double conversionValue = baseValue / targetCurrency.toBaseCurrencyValue();
		return new Money(amount * conversionValue, targetCurrency);
	}
	
	@Override 
	public String toString() {
		return amount.toString() + " " + currency.toString();
	}
}
