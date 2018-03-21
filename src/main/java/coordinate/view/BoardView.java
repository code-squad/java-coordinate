package coordinate.view;

import java.util.List;

import coordinate.domain.CoordinateMake;
import coordinate.domain.Line;
import coordinate.domain.Point;

public class BoardView {

	public static void makeBoard(List<Line> lines) {
		for (int i = 23; i >= 0; i--) {
			BoardView.createY(i + 1);
			BoardView.printPoint(i, lines);
		}
		BoardView.createX();
	}

	public static void createY(int i) {
		if (i % 2 == 0) {
			System.out.printf("%2d", i);
			System.out.print("|");
		} else {
			System.out.print("  ");
			System.out.print("|");
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

	public static void printPoint(int i, List<Line> lines) {
		Line line = lines.get(i);
		for (int j = 0; j < 24; j++) {
			BoardView.isCoordinate(i, j, line.getPoints());
		}
		System.out.println();
	}

	public static void isCoordinate(int i, int j, List<Point> points) { // 좌표면 출력
		if (points.get(j).isCoordinate()) {
			System.out.print("● ");
		}
		 System.out.print("  ");
	}
	
	public static void solveLine(double length){
		System.out.println("두 점 사이 거리는 " + length);
	}
}
