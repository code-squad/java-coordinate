package coordinate.domain;

import java.util.ArrayList;

public class PointLine {
	private ArrayList<Point> pointLine;
	private int yAxis;
	private String label;

	public PointLine(ArrayList<Point> pointLine, int yAxis) {
		this.pointLine = pointLine;
		this.yAxis = yAxis;
	}

	public static PointLine init(int yAxis) {
		ArrayList<Point> pointLine = new ArrayList<>();
		/*
		 * for (int xAxis = 0; xAxis < Common.MAXSIZE+1; xAxis++) {
		 * pointLine.add(new Point(xAxis)); }
		 */
		return new PointLine(pointLine, yAxis);
	}

	public void declareLabel() {
		if (Common.isOdd(yAxis)) {
			label = "  ";
		}
		if (!Common.isOdd(yAxis)) {
			label = String.valueOf(yAxis);
		}
		if (!Common.isOdd(yAxis) && yAxis < 10) {
			label = " " + yAxis;
		}
	}

	public String getLabel() {
		return label;
	}
}
