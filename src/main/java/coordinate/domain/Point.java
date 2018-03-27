package coordinate.domain;

import java.util.Objects;

import coordinate.view.InputCoordinate;

public class Point {

	private final int MIN = 0;
	private final int MAX = 24;
	private int pointX;
	private int pointY;

	public Point(int pointX, int pointY) {
		if (pointX < MIN || pointX > MAX || pointY < MIN || pointY > MAX) {
			throw new IllegalArgumentException("24초과의 값은 좌표가 될 수 없습니다.");
		}
		this.pointX = pointX;
		this.pointY = pointY;
	}

	public static Point of(String str) {
		String[] pointXY = str.split(",");
		if (pointXY.length != 2) {
			throw new IllegalArgumentException("좌표의 값이 잘못 입력 되었습니다.");
		}
		return new Point(Integer.parseInt(pointXY[0]), Integer.parseInt(pointXY[1]));
	}

	public int getHeight(Point otherPoint) {
		return Math.abs(this.pointY - otherPoint.getPointY());
	}

	public int getWidth(Point otherPoint) {
		return Math.abs(this.pointX - otherPoint.getPointX());
	}
	
	public double lineLength(Point otherPoint) {
		double height = getWidth(otherPoint);
		double width = getHeight(otherPoint);
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}

	public int getPointX() {
		return this.pointX;
	}

	public int getPointY() {
		return this.pointY;
	}

	@Override
	public int hashCode() {
		return Objects.hash(pointX, pointY);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			Point point = (Point) obj;
			if (pointX == point.pointX && pointY == point.pointY) {
				return true;
			}
		}
		return false;
	}
}
