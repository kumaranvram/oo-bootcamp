package test;

import junit.framework.Assert;
import main.Ball;
import main.Balls;
import main.Color;
import main.IRule;
import main.MaxThreeBallsRule;

import org.junit.Test;

public class MaxThreeBallsRuleTest {

	@Test
	public void shouldEnsureThatThereAreMaximumOnlyThreeBalls()
	{
		IRule rule = new MaxThreeBallsRule();
		Balls balls = new Balls();
		balls.add(new Ball(Color.GREEN));
		balls.add(new Ball(Color.GREEN));
		balls.add(new Ball(Color.GREEN));
		
		boolean valid = rule.apply(balls, new Ball(Color.GREEN));
		
		Assert.assertEquals(false, valid);
	}
	
	@Test
	public void shouldAllowThreeBalls()
	{
		IRule rule = new MaxThreeBallsRule();
		Balls balls = new Balls();
		balls.add(new Ball(Color.GREEN));
		balls.add(new Ball(Color.GREEN));
		
		boolean valid = rule.apply(balls, new Ball(Color.GREEN));
		
		Assert.assertEquals(true, valid);
	}

	
	@Test
	public void shouldAllowOtherColouredBalls()
	{
		IRule rule = new MaxThreeBallsRule();
		Balls balls = new Balls();
		balls.add(new Ball(Color.BLUE));
		
		boolean valid = rule.apply(balls, new Ball(Color.RED));
		
		Assert.assertEquals(true, valid);
	}
	
	@Test
	public void shouldBeApplicableForGreenBallOnly()
	{
		IRule rule = new MaxThreeBallsRule();	
				
		Assert.assertEquals(true, rule.isApplicable(new Ball(Color.GREEN)));
		
		Assert.assertEquals(false, rule.isApplicable(new Ball(Color.BLUE)));
		
	}
	
	

}
