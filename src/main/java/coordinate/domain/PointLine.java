package coordinate.domain;

import java.util.ArrayList;
import java.util.Arrays;

public class PointLine {
	private ArrayList<Point> points;
	private int yAxis;
	private String[] line;

	public PointLine(ArrayList<Point> points, int yAxis) {
		this.points = points;
		this.yAxis = yAxis;
	}

	public PointLine(ArrayList<Point> points, int yAxis, String[] line) {
		this.points = points;
		this.yAxis = yAxis;
		this.line = line;
	}

	public static PointLine init(int yAxis, Coordinates inputCoordinates) {
		ArrayList<Point> points = new ArrayList<>();
		String[] line = new String[Common.MAXSIZE];
		Arrays.fill(line, "  ");
		int temp = 0;
		for (int i = 0; i < inputCoordinates.size(); i++) {
			if (yAxis == inputCoordinates.getyAxis(i)) {
				points.add(new Point(inputCoordinates.getxAxis(i)));
				line[inputCoordinates.getxAxis(i)] = "*";
				temp++;
			}
		}
		if (temp == 0) {
			return new PointLine(points, yAxis);
		}
		return new PointLine(points, yAxis, line);
	}

	public String makeLabel() {
		String label = "";
		if (Common.isOdd(yAxis)) {
			label = "  ";
		}
		if (!Common.isOdd(yAxis)) {
			label = String.valueOf(yAxis);
		}
		if (!Common.isOdd(yAxis) && yAxis < 10) {
			label = " " + yAxis;
		}
		return label;
	}

	public ArrayList<Point> getPoints() {
		return points;
	}

	public String getLine() {
		if (points.size() != 0) {
			return fillLine() + "\n";
		}
		return "\n";
	}

	public String fillLine() {
		String temp = "";
		for (int i = 0; i < line.length; i++) {
			temp += line[i];
		}
		return temp;
	}
}
