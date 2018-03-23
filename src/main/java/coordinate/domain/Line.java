package coordinate.domain;

import java.util.ArrayList;

public class Line {
	private Point first;
	private Point second;

	public Line(Point first, Point second) {
		this.first = first;
		this.second = second;
	}

	public static Line of(ArrayList<Point> points) {
		return new Line(points.get(0), points.get(1));
	}

	public double getDistance() {
		return first.getDistance(second);
	}

}
