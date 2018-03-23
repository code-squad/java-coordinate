package coordinate.domain;

public class Point {
	private int xAxis;
	private int yAxis;

	public Point(int x, int y) {
		xAxis = x;
		yAxis = y;
	}

	public Point(String Coordinate) {
		String[] points = Coordinate.split(",");
		xAxis = Integer.parseInt(points[0]);
		yAxis = Integer.parseInt(points[1]);
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

	public String drawPoint(int beforeXaxis, int i, String pointLine) {
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

	public double getDistance(Point otherPoint) {
		return Math.sqrt(Math.pow(xAxis - otherPoint.getxAxis(), 2) + Math.pow(yAxis - otherPoint.getyAxis(), 2));
	}

}
