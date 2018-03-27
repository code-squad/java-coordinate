package coordinate.domain;

import java.util.ArrayList;

public class Triangle extends Figure {

	public Triangle(ArrayList<Point> points) {
		super(points);
	}

	public static Triangle of(ArrayList<Point> points) {
		if (points.size() != 3) {
			throw new IllegalArgumentException("점이 3개가 아닙니다.");
		}
		return new Triangle(points);
	}

	@Override
	public double getArea() {
		double a = getDistance(0, 1);
		double b = getDistance(1, 2);
		double c = getDistance(2, 0);
		double s = (a + b + c) / 2;
		return Math.sqrt(s * ((s - a) * (s - b) * (s - c)));
	}

	public boolean isTriangle() {
		if (!(Point.isOneLine(getPoint(0), getPoint(1), getPoint(2)))) {
			return true;
		}
		return false;
	}

}
