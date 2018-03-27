package coordinate.domain;

import java.util.ArrayList;
import java.util.List;

public class Line extends Figure {

	public Line(List<Point> points) {
		super(points);
		if (!isLine(points)) {
			throw new IllegalArgumentException("선이 아닙니다.");
		}
	}

	public double area() {
		return lineLength(0, 1);
	}

	public static boolean isLine(List<Point> points) {
		return points.size() == 2;
	}
}
