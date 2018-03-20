package coordinate.domain;

public class Point {

	private int pointX;
	private boolean coordinate;

	public Point(int pointX, boolean input) {
		this.pointX = pointX;
		this.coordinate = input;
	}

	public boolean isNextTrue(int i) { // 입력된 좌표 값이 다음과 같으면 true 반환
		return this.pointX + 1 == i;
	}

	public Point coordinate() { // isNextTrue면 좌표 생성
		return of(pointX + 1, true);
	}

	public Point next() {
		return of(pointX + 1, false);
	}

	public static Point of(int pointX, boolean input) {
		return new Point(pointX, input);
	}

	public boolean getCoordinate() {
		return this.coordinate;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			Point point = (Point) obj;
			if(pointX==point.pointX && coordinate==point.coordinate) {
				return true;
			}
		}
		return false;
	}
	
	
}
