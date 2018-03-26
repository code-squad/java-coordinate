package coordinate.domain;

import java.util.ArrayList;
import java.util.List;

public class Line extends Figure {

	private Point first;
	private Point second;

	public Line(List<Point> points) {
		if (!isLine(points)) {
			throw new IllegalArgumentException("선이 아닙니다.");
		}

		this.first = points.get(0);
		this.second = points.get(1);
	}

	public double area() {
		return first.lineLength(second);
	}

	public static boolean isLine(List<Point> points) {
		return points.size() == 2;
	}
}
