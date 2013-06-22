package main;

public class MaxTwelveBallRule implements IRule {

	@Override
	public boolean apply(Balls balls, Ball ball) {
		return balls.size() < 12;
			
	}

	@Override
	public boolean isApplicable(Ball ball) {
		return true;
	}

}
