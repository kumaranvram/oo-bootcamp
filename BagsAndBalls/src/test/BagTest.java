package test;

import junit.framework.Assert;
import main.Bag;
import main.Ball;
import main.Color;

import org.junit.Test;

public class BagTest
{
	@Test
	public void shouldAddABall()
	{
		//Arrange
		Bag bag = new Bag();
		//Act
		bag.addBall(new Ball(Color.GREEN));
		//Assert
		Assert.assertEquals(1, bag.ballsCount());
	}
	
	@Test
	public void shouldAddAGreenBall() {
		Bag bag = new Bag();
		
		bag.addBall(new Ball(Color.GREEN));
		
		Assert.assertEquals(1, bag.ballsCount());
		Assert.assertEquals(1, bag.green());
	}
	
	@Test
	public void shouldAddARedBall() {
		Bag bag = new Bag();
		
		bag.addBall(new Ball(Color.RED));
		
		Assert.assertEquals(1, bag.ballsCount());
		Assert.assertEquals(1, bag.red());
	}


	@Test
	public void shouldAddAYellowBall() {
		Bag bag = new Bag();
		
		bag.addBall(new Ball(Color.YELLOW));
		
		Assert.assertEquals(1, bag.ballsCount());
		Assert.assertEquals(1, bag.yellow());
	}
	

	@Test
	public void shouldAddABlueBall() {
		Bag bag = new Bag();
		
		bag.addBall(new Ball(Color.BLUE));
		
		Assert.assertEquals(1, bag.ballsCount());
		Assert.assertEquals(1, bag.blue());
	}
	
	@Test
	public void shouldGetASummaryOfBag() {
		Bag bag = new Bag();
		
		bag.addBall(new Ball(Color.BLUE));
		bag.addBall(new Ball(Color.BLUE));
		bag.addBall(new Ball(Color.RED));
		bag.addBall(new Ball(Color.YELLOW));
		
		String summary = bag.summary();
		
		Assert.assertEquals("Blue: 2, Green: 0, Red: 1, Yellow: 1", summary);	
	}
	
	
	@Test
	public void shouldNotAllowFourthGreenBallToGetAddedToBag() {
		Bag bag = new Bag();
		
		bag.addBall(new Ball(Color.GREEN));
		bag.addBall(new Ball(Color.GREEN));
		bag.addBall(new Ball(Color.GREEN));

		bag.addBall(new Ball(Color.GREEN));
				
		Assert.assertEquals(3, bag.ballsCount());
		Assert.assertEquals(3, bag.green());			
	}
	
	@Test
	public void shouldNotAllowThirteenthBallToGetAddedToBag() {
		Bag bag = new Bag();
		
		bag.addBall(new Ball(Color.GREEN));
		bag.addBall(new Ball(Color.GREEN));
		bag.addBall(new Ball(Color.GREEN));
		bag.addBall(new Ball(Color.BLUE));
		bag.addBall(new Ball(Color.BLUE));
		bag.addBall(new Ball(Color.BLUE));
		bag.addBall(new Ball(Color.RED));
		bag.addBall(new Ball(Color.RED));
		bag.addBall(new Ball(Color.YELLOW));
		bag.addBall(new Ball(Color.YELLOW));
		bag.addBall(new Ball(Color.YELLOW));
		bag.addBall(new Ball(Color.YELLOW));

		bag.addBall(new Ball(Color.YELLOW));
				
		Assert.assertEquals(12, bag.ballsCount());			
	}

	
	
}
