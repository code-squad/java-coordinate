package coordinate.domain;

public class Point {

	private int pointX;
	private boolean coordinate;

	private Point(int pointX, boolean coordinate) {
		this.pointX = pointX;
		this.coordinate = coordinate;
	}

	public static Point coordinate(int i) {
		return of(i, true);
	}

	public static Point makeNomal(int i) {
		return of(i, false);
	}

	public static Point of(int pointX, boolean coordinate) {
		return new Point(pointX, coordinate);
	}

	public boolean isCoordinate() {
		return this.coordinate;
	}

	public int getX() {
		return this.pointX;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			Point point = (Point) obj;
			if (pointX == point.pointX && coordinate == point.coordinate) {
				return true;
			}
		}
		return false;
	}

}
