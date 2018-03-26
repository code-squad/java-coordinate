package coordinate.view;

import java.util.List;

import coordinate.domain.Line;
import coordinate.domain.Point;

public class BoardView {

	public static void makeBoard(List<Point> points) {
		for (int i = 23; i >= 0; i--) {
			createY(i + 1);
			printPoint(i, points);
		}
		createX();
	}

	public static void createY(int i) {
		if (i % 2 == 0) {
			System.out.printf("%2d", i);
		} else {
			System.out.print("  ");
		}
	}

	public static void createX() {
		for (int j = 0; j <= 24; j++) {
			if (j == 0) {
				System.out.print("  +");
			} else {
				System.out.print("──");
			}
		}
		System.out.println();
		for (int j = 0; j <= 24; j++) {
			if (j % 2 == 0) {
				System.out.printf("%3d ", j);
			}
		}
		System.out.println();
	}

	public static void printPoint(int i, List<Point> points) {
		for (int j = 0; j < 24; j++) {
			int flag = isCoordinate(i, j, points);
			if (j == 0 && flag == 0) {
				System.out.print("|");
			}
			if (flag == 0) {
				System.out.print("  ");
			}
		}
		System.out.println();
	}

	public static int isCoordinate(int i, int j, List<Point> points) { // 좌표면 출력
		int flag = 0;
		for (int k = 0; k < points.size(); k++)
			if (points.get(k).getPointX() == j && points.get(k).getPointY() == i) {
				System.out.print("● ");
				flag++;
			}
		return flag;
	}

	public static void printArea(double area, List<Point> points) {
		if (points.size() == 2) {
			System.out.println("두 점 사이 거리는 : " + area);
		}
		if (points.size() == 3) {
			System.out.println("삼각형의 넓이는 : " + area);
		}
		if (points.size() == 4)
			System.out.println("사각형의 넓이는 : " + area);
	}
}
