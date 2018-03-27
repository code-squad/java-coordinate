package coordinate.domain;

import java.util.ArrayList;

public abstract class Figure {
	private ArrayList<Point> points;

	public Figure(ArrayList<Point> points) {
		this.points = points;
	}

	protected Point getPoint(int i) {
		return points.get(i);
	}

	protected int size() {
		return points.size();
	}

	public abstract double getArea();

	protected double getDistance(int i, int y) {
		return points.get(i).getDistance(points.get(y));
	}

}
