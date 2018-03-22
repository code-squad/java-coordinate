package coordinate.domain;

import java.util.ArrayList;
import java.util.List;

public class Line {

	private Point first;
	private Point second;

	public Line(Point first, Point second) {
		this.first = first;
		this.second = second;
	}

	public double lineResult() {
		double width = absoluteValue(first.getPointX(), second.getPointX());
		double height = absoluteValue(first.getPointY(), second.getPointY());
		return lineLength(width, height);
	}

	public double lineLength(double width, double height) {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}

	public double absoluteValue(int first, int second) {
		return Math.abs(first - second);
	}

}
