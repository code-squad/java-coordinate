package coordinate.view;

import coordinate.domain.Calculater;
import coordinate.domain.Common;
import coordinate.domain.Coordinates;
import coordinate.domain.Frame;

public class Print {

	public static void drawYaxis(Frame pointLines) {
		for (int yAxis = pointLines.size() - 1; yAxis > 0; yAxis--) {
			System.out.print(pointLines.makeLabel(yAxis) + "|");
			System.out.print(pointLines.getLine(yAxis));
		}
	}

	public static void drawXaxis() {
		printXaxisBar();
		for (int i = 0; i < Common.MAXSIZE + 1; i++) {
			System.out.print(printxValue(i));
		}
		System.out.println("\n\n");
	}

	public static void printXaxisBar() {
		System.out.print("  " + "*");
		for (int i = 0; i < Common.MAXSIZE + 1; i++) {
			System.out.print("───");
		}
		System.out.println();
		System.out.print("  ");
	}

	public static String printxValue(int i) {
		if (!Common.isOdd(i))
			return i + "  ";
		return "  ";
	}

	public static void printResult(Coordinates inputCoordinates, Calculater calculater) {
		if (inputCoordinates.size() == 2) {
			System.out.println("두점 사이의 거리는");
			System.out.println(calculater.calcTwoPointDistance());
			return;
		}
		
		if (inputCoordinates.size() == 3) {
			if (calculater.isTriangle()) {
				System.out.println("삼각형의 넓이는");
				System.out.println(calculater.calcThreePointDistance());
				return;
			}
			System.out.println("삼각형이 아닙니다.");
			return;
		}
		
		
		if (inputCoordinates.size() == 4) {
			if (calculater.isSquare()) {
				System.out.println("사각형의 넓이는");
				System.out.println(calculater.calcFourPoint());
				return;
			}
			System.out.println("직사각형 또는 정사각형이 아닙니다.");
			return;
		}

		System.out.println("좌표계산기 종료");
	}

}
