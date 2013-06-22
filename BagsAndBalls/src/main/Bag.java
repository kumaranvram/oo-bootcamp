package main;

import java.util.ArrayList;
import java.util.List;

public class Bag {

	private Balls balls = new Balls();
	private List<IRule> rules = new ArrayList<IRule>();
	
	public Bag() {
	   rules.add(new MaxThreeBallsRule());
	   rules.add(new MaxTwelveBallRule());
	}


	public void addBall(Ball ball) {
		for (IRule rule : rules) {
			if(rule.isApplicable(ball)){
				boolean valid = rule.apply(balls, ball);
				if(!valid) return;
			}
		}
		balls.add(ball);
	}

	public int ballsCount() {
		return balls.size();
	}

	public int green() {
		return balls.countBy(Color.GREEN);
	}

	public int red() {
		return balls.countBy(Color.RED);
	}

	public int blue() {
		return balls.countBy(Color.BLUE);
	}

	public int yellow() {
		return balls.countBy(Color.YELLOW);
	}

	public String summary() {
		return String.format("Blue: %d, Green: %d, Red: %d, Yellow: %d", blue(), green(), red(), yellow());		
	}

}
