package coordinate.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Square implements Figure {
	
	private static final int SQUARE = 2;
	private Point standard;
	private Point oppositionPoint;

	private Square(Point standard, Point oppositionPoint) {
		this.standard = standard;
		this.oppositionPoint = oppositionPoint;
	}

	public double area() {
		double width = standard.getWidth(oppositionPoint);
		double height = standard.getHeight(oppositionPoint);
		return width * height;
	}

	public static Square init(List<Point> points) {
		check(points);
		Point standard = points.get(0);
		Point oppositionPoint = findOppositionPoint(points);
		return of(standard, oppositionPoint);
	}

	public static Point findOppositionPoint(List<Point> points) {
		Point standard = points.get(0);
		Point oppositionPoint = null;
		for (int i = 1; i < points.size(); i++) {
			if (!standard.equals(points.get(i))) { // X,Y가 겹치지 않는 점을 찾는다.
				oppositionPoint = points.get(i);
			}
		}
		return oppositionPoint;
	}

	public static Square of(Point standard, Point oppositionPoint) { // 서로 대각선에 있는 점을 찾는다.
		return new Square(standard, oppositionPoint);
	}

	public static void check(List<Point> points) {
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

	public static void checkException(HashSet<Integer> setX, HashSet<Integer> setY) {
		if (setX.size() != SQUARE || setY.size() != SQUARE) {
			throw new IllegalArgumentException("직사각형이 아닙니다.");
		}
	}

	public static boolean isSquare(List<Point> points) {
		return points.size() == 4;
	}
}
