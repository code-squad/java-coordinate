package coordinate.domain;

public class Point {
	private int xAxis;
	private int yAxis;

	public Point(Point point) {
		xAxis = point.getxAxis();
		yAxis = point.getyAxis();
	}

	public Point(int x, int y) {
		xAxis = x;
		yAxis = y;
	}

	public int getxAxis() {
		return xAxis;
	}

	public int getyAxis() {
		return yAxis;
	}

	public String drawPoint(int yAxis, int blankPosition) {
		if (isSameYaxis(yAxis)) {
			return new String(new char[xAxis - blankPosition - 1]).replace("\0", " ") + "*";
		}
		return "";
	}

	public Boolean isSameYaxis(int yAxis) {
		return this.yAxis == yAxis;
	}

	public double getDistance(Point otherPoint) {
		return Math.sqrt(Math.pow(xAxis - otherPoint.getxAxis(), 2) + Math.pow(yAxis - otherPoint.getyAxis(), 2));
	}

}
