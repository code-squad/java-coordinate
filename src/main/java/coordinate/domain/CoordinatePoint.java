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

	public List<Point> dividePoint(String[] str) {
		List<Point> points = new ArrayList<>();

		for (int i = 0; i < str.length; i++) {
			str[i] = str[i].substring(1, str[i].length() - 1);
			Point coordinate = new Point(str[i]);
			points.add(coordinate);
		}
		return points;
	}

	public double decideFigure() { // 도형의 타입을 결정해주고 결과 값을 반환
		if (isLine()) {
			Line line = new Line(points);
			return line.lineResult();
		}
		Square square = new Square(points);
		return square.area();
	}

	public boolean isLine() {
		return points.size() == 2;
	}

	public boolean isSquare() {
		return points.size() == 4;
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
