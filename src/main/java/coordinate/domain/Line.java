package coordinate.domain;

import java.util.ArrayList;
import java.util.List;

public class Line {

	private Point first;
	private Point second;

	public Line(List<Point> points) {
		if (points.size() != 2) {
			throw new IllegalArgumentException("선이 아닙니다.");
		}

		this.first = points.get(0);
		this.second = points.get(1);
	}

	public double lineResult() {
		double width = first.getWidth(second);
		double height = first.getHeight(second);
		return lineLength(width, height);
	}

	public static double lineLength(double width, double height) {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
}
