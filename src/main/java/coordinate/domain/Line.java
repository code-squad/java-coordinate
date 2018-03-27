package coordinate.domain;

import java.util.List;

public class Line {
	private Point first;
	private Point second;

	public Line(Point first, Point second) {
		this.first = first;
		this.second = second;
	}

	public static Line of(List<Point> points) {
		if (points.size() != 2) {
			throw new IllegalArgumentException("점이 2개가 아닙니다.");
		}
		return new Line(points.get(0), points.get(1));
	}

	public double getDistance() {
		return first.getDistance(second);
	}

	public boolean isSameXaxis() {
		return first.getxAxis() == second.getxAxis();
	}

	public boolean isSameYaxis() {
		return first.getyAxis() == second.getyAxis();
	}

}
