package test;

import static org.junit.Assert.*;
import main.Currency;
import main.Money;

import org.junit.Test;

public class MoneyTest {

	@Test
	public void shouldConvertINRToUSD() {
		Money money  = new Money(new Double(240), Currency.INR);
		
		Money inUSD = money.toUSDollars();
		
		assertEquals("4.0 USD", inUSD.toString());
	}
	
	@Test
	public void shouldConvertUSDToINR() {
		Money money  = new Money(4.0, Currency.USD);
		
		Money inUSD = money.toIndianRupee();
		
		assertEquals("240.0 INR", inUSD.toString());
	}
	
	@Test
	public void shouldConvertEURToINR() {
		Money money  = new Money(new Double(4.0), Currency.EURO);
		
		Money inUSD = money.toIndianRupee();
		
		assertEquals("320.0 INR", inUSD.toString());
	}
	
	@Test
	public void shouldConvertINRToINR() {
		Money money  = new Money(new Double(4.0), Currency.INR);
		
		Money inUSD = money.toIndianRupee();
		
		assertEquals("4.0 INR", inUSD.toString());
	}
}
