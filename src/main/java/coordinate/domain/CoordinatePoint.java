package coordinate.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import coordinate.view.InputCoordinate;

public class CoordinatePoint {

	List<Point> points;

	public CoordinatePoint(String[] inputNumber) {
		this.points = dividePoint(inputNumber);
		checkSamePoint(points);
	}

	public List<Point> dividePoint(String[] strs) {
		List<Point> points = new ArrayList<>();

		for (String str : strs) {
			str = str.substring(1, str.length() - 1);
			Point coordinate = Point.of(str);
			points.add(coordinate);
		}
		return points;
	}
	
	public Figure decideFigure() { // 도형의 타입을 결정해주고 결과 값을 반환
		if (Line.isLine(points)) {
			return new Line(points);
		}
		if (Triangle.isTriangle(points)) {
			return new Triangle(points);
		}
		return new Square(points);
	}

	public List<Point> getPoints() {
		return points;
	}

	public static void checkSamePoint(List<Point> points) {
		HashSet<Point> hash = new HashSet<>(points);
		if (hash.size() != points.size()) {
			throw new IllegalArgumentException("같은 좌표 값을 입력하셨습니다.");
		}
	}
}
