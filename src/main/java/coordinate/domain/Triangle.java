package coordinate.domain;

import java.util.List;

public class Triangle extends Figure {

	public Triangle(List<Point> points) {
		super(points);
		if (!isTriangle(points)) {
			throw new IllegalArgumentException("삼각형이 아닙니다.");
		}
	}

	public double area() { // s(s-a)(s-b)(s-c)를 구한다.
		double line1 = lineLength(0, 1);
		double line2 = lineLength(1, 2);
		double line3 = lineLength(2, 3);
		double formula = heron(line1, line2, line3);

		double heronFormula = formula * (formula - line1) * (formula - line2) * (formula - line3);
		return Math.sqrt(heronFormula);
	}

	public double heron(double line1, double line2, double line3) { // s = (a+b+c)/2 이다.
		return (line1 + line2 + line3) / 2;
	}

	public static boolean isTriangle(List<Point> points) {
		return points.size() == 3;
	}

}
