package coordinate.domain;

import java.util.ArrayList;
import java.util.HashSet;

import coordinate.view.Input;

public class Point {
	private int xAxis;
	private int yAxis;

	public Point(String[] points) {
		xAxis = Integer.parseInt(points[0]);
		yAxis = Integer.parseInt(points[1]);
	}

	public static Point of(String coordinate) {
		String[] points = coordinate.split(",");
		if (points.length > 2) {
			throw new IllegalArgumentException("잘못된 좌표 형태입니다.");
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

	public static Boolean isOneLine(Point point, Point anotherPoint, Point otherPoint) {
		return (point.isSameYaxis(anotherPoint.yAxis) && point.isSameYaxis(otherPoint.yAxis))
				|| (point.isSameXaxis(anotherPoint.xAxis) && point.isSameXaxis(otherPoint.xAxis));
	}

	public double getDistance(Point otherPoint) {
		return Math.sqrt(Math.pow(xAxis - otherPoint.getxAxis(), 2) + Math.pow(yAxis - otherPoint.getyAxis(), 2));
	}

	public static ArrayList<Point> isSamePoint(ArrayList<Point> inputPoints) {
		for (int i = 0; i < inputPoints.size() - 1; i++) {
			inputPoints = isSamePoint(i, inputPoints);
		}
		return inputPoints;
	}

	public static ArrayList<Point> isSamePoint(int i, ArrayList<Point> inputPoints) {
		for (int j = i + 1; j < inputPoints.size(); j++) {
			inputPoints = isSamePoint(inputPoints, i, j);
		}
		return inputPoints;
	}

	public static ArrayList<Point> isSamePoint(ArrayList<Point> inputPoints, int i, int j) {

		HashSet<Point> checker = new HashSet<>();
		checker.addAll(inputPoints);

		if (inputPoints.size() != checker.size()) {
			System.out.println("위치가 같은 점(point)이 존재합니다. 세 점의 위치는 달라야 합니다.");
			return Input.inputPoints();
		}
		return inputPoints;
	}

	@Override
	public int hashCode() {
		String point = "x:" + xAxis + "y:" + yAxis;
		return point.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			Point temp = (Point) obj;
			return check(temp);
		}
		return false;
	}

	public boolean check(Point temp) {
		if (this.xAxis == temp.xAxis && this.yAxis == temp.yAxis) {
			return true;
		}
		return false;
	}
}