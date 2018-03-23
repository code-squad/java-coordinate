package coordinate.domain;

import java.util.ArrayList;

public class Square {
	private ArrayList<Point> points;

	public Square(ArrayList<Point> points) {
		this.points = points;
	}

	public static Square of(ArrayList<Point> points) {
		return new Square(points);
	}

	public boolean isSquare() {
		int flag = 0;
		for (int i = 0; i < points.size() - 1; i++) {
			for (int j = i + 1; j < points.size(); j++) {
				if (points.get(i).isSameXaxis(points.get(j).getxAxis())) {
					flag++;
				}
				if (points.get(i).isSameYaxis(points.get(j).getyAxis())) {
					flag++;
				}
			}
		}
		return flag == 4;
	}

	public double getArea() {
		double width = 0;
		double height = 0;
		for (int i = 0; i < points.size() - 1; i++) {
			width = calcWidth(i, width);
			height = calcHeight(i, height);
		}
		return Math.abs(width * height);
	}

	public double calcWidth(int i, double width) {
		for (int j = i + 1; j < points.size(); j++) {
			if (points.get(i).isSameXaxis(points.get(j).getxAxis())) {
				width = points.get(i).getDistance(points.get(j));
			}
		}
		return width;
	}

	public double calcHeight(int i, double height) {
		for (int j = i + 1; j < points.size(); j++) {
			if (points.get(i).isSameYaxis(points.get(j).getyAxis())) {
				height = points.get(i).getDistance(points.get(j));
			}
		}
		return height;
	}

}
