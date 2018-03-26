package coordinate.view;

import java.util.ArrayList;
import coordinate.domain.Line;
import coordinate.domain.Point;
import coordinate.domain.Square;
import coordinate.domain.Triangle;

public class Print {
	public static String drawFrame(int yAxis, ArrayList<Point> points) {
		String label = drawLabel(yAxis);
		int beforeXaxis = 0;
		String pointLine = "";
		for (int i = 0; i < points.size(); i++) {
			if (points.get(i).isSameYaxis(yAxis)) {
				pointLine = points.get(i).drawPoint(beforeXaxis, pointLine);
				beforeXaxis = points.get(i).getxAxis();
			}
		}
		return label + pointLine;
	}

	public static String drawLabel(int yAxis) {
		if (yAxis % 2 == 0) {
			return isOverTen(yAxis);
		}
		return "  |";
	}

	public static String isOverTen(int yAxis) {
		if (yAxis < 10) {
			return " " + yAxis + "|";
		}
		return yAxis + "|";
	}

	public static void printFrame(ArrayList<Point> points) {
		for (int yAxis = 24; yAxis > 0; yAxis--) {
			System.out.println(drawFrame(yAxis, points));
		}
		drawXaxis();
	}

	public static void drawXaxis() {
		System.out.print("  *");
		for (int xAxis = 0; xAxis < 25; xAxis++) {
			System.out.print("──");
		}
		System.out.print("\n ");
		for (int xAxis = 0; xAxis < 25; xAxis++) {
			System.out.print(drawXaxis(xAxis));
		}
	}

	public static String drawXaxis(int xAxis) {
		if (xAxis % 2 == 0) {
			return String.valueOf(xAxis) + " ";
		}
		return " ";
	}

	public static void printResult(ArrayList<Point> points) {
		if (points.size() == 2) {
			lineResult(points);
		}

		if (points.size() == 3) {
			isTriangle(points);
		}

		if (points.size() == 4) {
			isSquare(points);
		}
	}

	public static void isTriangle(ArrayList<Point> points) {
		Triangle triangle = Triangle.of(points);
		if (triangle.isTriangle()) {
			triangleResult(points);
			return;
		}
		System.out.println("\n삼각형이 아닙니다.");
	}

	public static void isSquare(ArrayList<Point> points) {
		Square square = Square.of(points);
		if (square.isSquare()) {
			squareResult(points);
			return;
		}
		System.out.println("\n직사각형 또는 정사각형이 아닙니다.");
	}

	public static void lineResult(ArrayList<Point> points) {
		System.out.println("\n두점 사이의 거리는");
		Line line = Line.of(points);
		System.out.println(line.getDistance());
	}

	public static void triangleResult(ArrayList<Point> points) {
		System.out.println("\n삼각형의 넓이는");
		System.out.printf("%.1f", Triangle.getArea(points));
	}

	public static void squareResult(ArrayList<Point> points) {
		System.out.println("\n사각형의 넓이는");
		Square square = Square.of(points);
		System.out.printf("%.1f", square.getArea());
	}

}
