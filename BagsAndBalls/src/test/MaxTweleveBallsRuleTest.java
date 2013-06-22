package test;

import junit.framework.Assert;
import main.Ball;
import main.Balls;
import main.Color;
import main.IRule;
import main.MaxTwelveBallRule;

import org.junit.Test;

public class MaxTweleveBallsRuleTest {

	@Test
	public void shouldEnsureThatThereAreMaximumOfTwelveBalls()
	{
		IRule rule = new MaxTwelveBallRule();
		Balls balls = new Balls();
		
		balls.add(new Ball(Color.GREEN));
		balls.add(new Ball(Color.GREEN));
		balls.add(new Ball(Color.GREEN));
		balls.add(new Ball(Color.BLUE));
		balls.add(new Ball(Color.BLUE));
		balls.add(new Ball(Color.BLUE));
		balls.add(new Ball(Color.RED));
		balls.add(new Ball(Color.RED));
		balls.add(new Ball(Color.GREEN));
		balls.add(new Ball(Color.GREEN));
		balls.add(new Ball(Color.GREEN));
		balls.add(new Ball(Color.GREEN));
		
		boolean valid = rule.apply(balls, new Ball(Color.GREEN));
		
		Assert.assertEquals(false, valid);
	}
	
	
	@Test
	public void shouldBeApplicableForAnyBall()
	{
		IRule rule = new MaxTwelveBallRule();
		Assert.assertEquals(true, rule.isApplicable(new Ball(Color.BLUE)));
	}
	
	
}
