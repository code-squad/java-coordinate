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
		return first.lineLength(second);
	}

	public static boolean isLine(List<Point> points) {
		return points.size() == 2;
	}
}
