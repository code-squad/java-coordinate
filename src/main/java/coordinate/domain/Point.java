package coordinate.domain;

import coordinate.view.InputCoordinate;

public class Point {

	private int pointX;
	private int pointY;

	public Point(String[] pointXY) {
		this.pointX = Integer.parseInt(pointXY[0]);
		this.pointY = Integer.parseInt(pointXY[1]);

		if (pointX < 0 || pointX > 24 || pointY < 0 || pointY > 24) {
			throw new IllegalArgumentException("24초과의 값은 좌표가 될 수 없습니다.");
		}
	}

	public int getHigh(Point otherPoint) {
		return Math.abs(this.pointY - otherPoint.getPointY());
	}

	public int getWidth(Point otherPoint) {
		return Math.abs(this.pointX - otherPoint.getPointX());
	}

	public int getPointX() {
		return this.pointX;
	}

	public int getPointY() {
		return this.pointY;
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
