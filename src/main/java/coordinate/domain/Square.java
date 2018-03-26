package coordinate.domain;

import java.util.ArrayList;

public class Square extends Figure {

	public Square(ArrayList<Point> points) {
		super(points);
	}

	public static Square of(ArrayList<Point> points) {
		return new Square(points);
	}

	public boolean isSquare() {
		for (int i = 0; i < super.size() - 1; i++) {
			boolean checkAxis = false;
			checkAxis = isSquare(checkAxis, i);
			if (!checkAxis) {
				return false;
			}
		}
		return true;
	}

	public boolean isSquare(boolean checkAxis, int i) {
		for (int j = i + 1; j < super.size(); j++) {
			Line line = new Line(super.getPoint(i), super.getPoint(j));
			checkAxis |= line.isSameXaxis() || line.isSameYaxis();
		}
		return checkAxis;
	}

	@Override
	public double getArea() {
		double width = 0;
		double height = 0;
		for (int i = 0; i < super.size() - 1; i++) {
			width = calcWidth(i, width);
			height = calcHeight(i, height);
		}
		return Math.abs(width * height);
	}

	public double calcHeight(int i, double height) {
		for (int j = i + 1; j < super.size(); j++) {
			Line line = new Line(super.getPoint(i), super.getPoint(j));
			height = calcHeight(line, height);
		}
		return height;
	}

	public double calcWidth(int i, double width) {
		for (int j = i + 1; j < super.getPoints().size(); j++) {
			Line line = new Line(super.getPoint(i), super.getPoint(j));
			width = calcWidth(line, width);
		}
		return width;
	}

	public double calcHeight(Line line, double height) {
		if (line.isSameYaxis()) {
			height = line.getDistance();
		}
		return height;
	}

	public double calcWidth(Line line, double width) {
		if (line.isSameXaxis()) {
			width = line.getDistance();
		}
		return width;
	}

}
