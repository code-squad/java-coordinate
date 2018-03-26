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
		double a = super.getPoints().get(0).getDistance(super.getPoints().get(1));
		double b = super.getPoints().get(1).getDistance(super.getPoints().get(2));
		double c = super.getPoints().get(2).getDistance(super.getPoints().get(0));
		double s = (a + b + c) / 2;
		return Math.sqrt(s * ((s - a) * (s - b) * (s - c)));
	}

	public boolean isTriangle() {
		if (!(Point.isOneLine(super.getPoints().get(0), super.getPoints().get(1), super.getPoints().get(2)))) {
			return true;
		}
		return false;
	}

}
