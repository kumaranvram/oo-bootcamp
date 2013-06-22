package test;

import junit.framework.Assert;
import main.Ball;
import main.Balls;
import main.Color;

import org.junit.Test;

public class BallsTest {
	
	@Test
	public void shouldGetCountByColor()
	{
		Balls balls = new Balls();
		balls.add(new Ball(Color.BLUE));
		balls.add(new Ball(Color.BLUE));
		balls.add(new Ball(Color.GREEN));
		
		int count = balls.countBy(Color.BLUE);
		
		Assert.assertEquals(2, count);
	}


	@Test
	public void shouldReturnZeroWhenBallsIsEmpty()
	{
		Balls balls = new Balls();
		
		int count = balls.countBy(Color.BLUE);
		
		Assert.assertEquals(0, count);
	}
	
	
	@Test
	public void shouldReturnZeroWhenColorBallDoesNotExist()
	{
		Balls balls = new Balls();
		balls.add(new Ball(Color.GREEN));
		
		int count = balls.countBy(Color.BLUE);
		
		Assert.assertEquals(0, count);
	}


}
