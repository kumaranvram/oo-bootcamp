package main;

public class MaxThreeBallsRule implements IRule {

	@Override
	public boolean apply(Balls balls, Ball ball) {
	     return (balls.countBy(Color.GREEN) < 3);
	}
	
	@Override
	public boolean isApplicable(Ball ball) {
		return ball.isColor(Color.GREEN);
	}
	
}
