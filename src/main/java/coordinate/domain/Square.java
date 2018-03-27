package coordinate.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Square extends Figure {

	private static final int SQUARE = 2;
	private Point standard;
	private Point oppositionPoint;

	public Square(List<Point> points) {
		super(points);
		check(points);
		this.standard = points.get(0);
		this.oppositionPoint = findOppositionPoint(points);
	}

	public double area() {
		double width = standard.getWidth(oppositionPoint);
		double height = standard.getHeight(oppositionPoint);
		return width * height;
	}

	public Point findOppositionPoint(List<Point> points) {
		Point oppositionPoint = null;
		for (int i = 1; i < points.size(); i++) {
			if (!standard.equals(points.get(i))) { // X,Y가 겹치지 않는 점을 찾는다.
				oppositionPoint = points.get(i);
			}
		}
		return oppositionPoint;
	}

	public void check(List<Point> points) {
		HashSet<Integer> setX = new HashSet<>();
		HashSet<Integer> setY = new HashSet<>();
		for (Point point : points) {
			int valueX = point.getPointX();
			int valueY = point.getPointY();
			setX.add(valueX);
			setY.add(valueY);
		}
		checkException(setX, setY);
	}

	public void checkException(HashSet<Integer> setX, HashSet<Integer> setY) {
		if (setX.size() != SQUARE || setY.size() != SQUARE) {
			throw new IllegalArgumentException("직사각형이 아닙니다.");
		}
	}

	public static boolean isSquare(List<Point> points) {
		return points.size() == 4;
	}
}
