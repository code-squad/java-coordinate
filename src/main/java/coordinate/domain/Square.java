package coordinate.domain;

import java.util.ArrayList;
import java.util.List;

public class Square extends Figure {
	private Point standard;
	private Point oppositionPoint;

	public Square(Point standard, Point oppositionPoint) {
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
		for (int i = 0; i < points.size(); i++) {
			int num = checkRectangle(points, i);
			checkException(num);
		}
	}

	public static int checkRectangle(List<Point> points, int i) {
		int num = 0;
		for (int j = 0; j < points.size(); j++) {
			if (i != j && points.get(i).isSameXOrY(points.get(j))) {
				num++;
			}
		}
		return num;
	}

	public static void checkException(int num) {
		if (num != 2) {
			throw new IllegalArgumentException("직사각형이 아닙니다.");
		}
	}

	public static boolean isSquare(List<Point> points) {
		return points.size() == 4;
	}
}
