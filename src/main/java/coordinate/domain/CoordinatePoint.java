package coordinate.domain;

import java.util.ArrayList;
import java.util.List;

import coordinate.view.InputCoordinate;

public class CoordinatePoint {

	List<Point> points;

	public CoordinatePoint(String inputNumber) {
		this.points = dividePoint(inputNumber);
		checkSamePoint(points);
	}

	public List<Point> dividePoint(String inputNumber) {
		String[] str = inputNumber.split("-");
		List<Point> points = new ArrayList<>();

		for (int i = 0; i < str.length; i++) {
			str[i] = str[i].substring(1, str[i].length() - 1);
			String[] pointXY = str[i].split(",");
			points.add(makePoint(pointXY));
		}
		return points;
	}

	public static Point makePoint(String[] pointXY) {
		Point coordinate = new Point(pointXY);
		return coordinate;
	}

	public double decideFigure() { // 도형의 타입을 결정해주고 결과 값을 반환
		Line line = new Line(points);
		return line.lineResult();
	}

	public List<Point> getPoints() {
		return points;
	}

	public static void checkSamePoint(List<Point> points) {
		for (int i = 0; i < points.size(); i++) {
			for (int j = 0; j < points.size(); j++) {
				if (i != j && points.get(i).equals(points.get(j))) {
					throw new IllegalArgumentException("같은 좌표 값을 입력하셨습니다.");
				}
			}
		}
	}
}
