package coordinate.domain;

import java.util.List;

public class Triangle extends Figure {

	private double line1;
	private double line2;
	private double line3;

	public Triangle(double line1, double line2, double line3) {
		this.line1 = line1;
		this.line2 = line2;
		this.line3 = line3;
	}

	public double area() { // s(s-a)(s-b)(s-c)를 구한다.
		double formula = heron();
		double heronFormula = formula * (formula - line1) * (formula - line2) * (formula - line3);
		return Math.sqrt(heronFormula);
	}

	public double heron() { // s = (a+b+c)/2 이다.
		return (line1 + line2 + line3) / 2;
	}

	public static Triangle of(List<Point> points) {
		if (!isTriangle(points)) {
			throw new IllegalArgumentException("삼각형이 아닙니다.");
		}
		Point p1 = points.get(0);
		Point p2 = points.get(1);
		Point p3 = points.get(2);

		double line1 = p1.lineLength(p2);
		double line2 = p2.lineLength(p3);
		double line3 = p3.lineLength(p1);
		return new Triangle(line1, line2, line3);
	}

	public static boolean isTriangle(List<Point> points) {
		return points.size() == 3;
	}

}
