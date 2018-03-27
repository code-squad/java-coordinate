package coordinate.domain;

import java.util.List;

public abstract class Figure {

	private List<Point> points;

	public Figure(List<Point> points) {
		this.points = points;
	}

	public double lineLength(int first, int second) {
		return points.get(first).lineLength(points.get(second));
	}

	public int getHeight(int first, int second) {
		return points.get(first).getHeight(points.get(second));
	}

	public int getWidth(int first, int second) {
		return points.get(first).getWidth(points.get(second));
	}

	public abstract double area();
}
