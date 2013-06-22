package main;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class Balls extends ArrayList<Ball>{

	public int countBy(String color) {
		int count=0;
		for (Ball ball : this) {
			if(ball.isColor(color))
				count++;
		}
		return count;
	}
	   
}
