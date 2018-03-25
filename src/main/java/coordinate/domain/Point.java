package coordinate.domain;

public class Point {
	private int xAxis;
	private int yAxis;

	public Point(String[] points) {
		xAxis = Integer.parseInt(points[0]);
		yAxis = Integer.parseInt(points[1]);
	}

	public static Point of(String coordinate) {
		String[] points = coordinate.split(",");

		for (int i = 0; i < points.length; i++) {
			if (points[i].length() > 2) {
				throw new IllegalArgumentException("잘못된 좌표 형태입니다.");
			}
		}
		return new Point(points);
	}

	public int getxAxis() {
		return xAxis;
	}

	public int getyAxis() {
		return yAxis;
	}

	public String drawPoint(int yAxis, int beforeXaxis) {
		if (isSameYaxis(yAxis)) {
			return new String(new char[Math.abs(xAxis - beforeXaxis - 1)]).replace("\0", " ") + "*";
		}
		return "";
	}

	public String drawPoint(int beforeXaxis, String pointLine) {
		if (beforeXaxis > xAxis) {
			pointLine = pointLine.substring(beforeXaxis - xAxis, pointLine.length());
			pointLine += drawPoint(yAxis, beforeXaxis);
			return pointLine;
		}
		pointLine += drawPoint(yAxis, beforeXaxis);
		return pointLine;
	}

	public Boolean isSameYaxis(int yAxis) {
		return this.yAxis == yAxis;
	}

	public Boolean isSameXaxis(int xAxis) {
		return this.xAxis == xAxis;
	}

	public Boolean isOneLine(Point anotherPoint, Point otherPoint) {
		return (isSameYaxis(anotherPoint.yAxis) && isSameYaxis(otherPoint.yAxis))
				|| (isSameXaxis(anotherPoint.xAxis) && isSameXaxis(otherPoint.xAxis));
	}

	public double getDistance(Point otherPoint) {
		return Math.sqrt(Math.pow(xAxis - otherPoint.getxAxis(), 2) + Math.pow(yAxis - otherPoint.getyAxis(), 2));
	}

}
