package coordinate.domain;

import java.util.List;

public abstract class Figure implements Calculator {
	private List<Point> points;
	
	public Figure(List<Point> points) {
		this.points = points;
	}

	protected Point getPoint(int i) {
		return points.get(i);
	}

	protected int size() {
		return points.size();
	}

	protected double getDistance(int i, int y) {
		return getPoint(i).getDistance(getPoint(y));
	}

}
