package main;

public class Ball {

	private String color;

	public Ball(String color) {
		this.color = color;
	}

	public boolean isColor(String color) {
		return this.color.equals(color);
	}

}
