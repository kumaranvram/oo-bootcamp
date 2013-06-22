package main;

public interface IRule {

	boolean apply(Balls balls, Ball ball);
	boolean isApplicable(Ball ball);

}
