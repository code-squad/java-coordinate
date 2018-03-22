package coordinate.domain;

import java.util.ArrayList;
import java.util.List;

import coordinate.view.InputCoordinate;

public class CoordinatePoint {

	List<Point> points;

	public CoordinatePoint(String inputNumber) {
		this.points = dividePoint(inputNumber);
	}

	public List<Point> dividePoint(String inputNumber) {
		String[] str = inputNumber.split("-");
		List<Point> points = new ArrayList<>();
		for (int i = 0; i < str.length; i++) {
			str[i] = str[i].substring(1, str[i].length() - 1);
			String[] pointXY = str[i].split(",");
			makePoint(pointXY, points);
		}
		return points;
	}

	public void makePoint(String[] pointXY, List<Point> points) {
		Point coordinate = new Point(Integer.parseInt(pointXY[0]), Integer.parseInt(pointXY[1]));
		points.add(coordinate);
	}

	public double decideFigure() { // 도형의 타입을 결정해주고 결과 값을 반환
		Line line = new Line(points.get(0), points.get(1));
		return line.lineResult();
	}

	public boolean isLine() {
		return points.size() == 2;
	}

	public boolean isTriangle() {
		return points.size() == 3;
	}

	public boolean isSquare() {
		return points.size() == 4;
	}

	public List<Point> getPoints() {
		return points;
	}
}
