package coordinate.domain;

import coordinate.view.InputCoordinate;

public class Point {

	private int pointX;
	private int pointY;

	public Point(int pointX, int pointY) {
		if (pointX > 24 || pointY > 24) {
			throw new IllegalArgumentException("24초과의 값은 좌표가 될 수 없습니다.");
		}

		this.pointX = pointX;
		this.pointY = pointY;
	}

	public int getPointX() {
		return this.pointX;
	}

	public int getPointY() {
		return this.pointX;
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
