package coordinate.view;

import java.util.ArrayList;
import java.util.HashMap;

import coordinate.domain.Common;
import coordinate.domain.Coordinate;
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

	public static void printResult(ArrayList<Coordinate> inputCoordinates) {
		if (inputCoordinates.size() == 2) {
			System.out.println("두점 사이의 거리는");
			System.out.println(calcCoordinate(inputCoordinates));
			return;
		}
		System.out.println("좌표계산기 종료");
	}

	public static double calcCoordinate(ArrayList<Coordinate> inputCoordinates) {
		double result = 0;
		if (inputCoordinates.size() == 2) { // 두점인경우
			result = calcTwoPointDistance(inputCoordinates);
		}
		return result;
	}

	public static double calcTwoPointDistance(ArrayList<Coordinate> inputCoordinates) {
		HashMap<String, Integer> tempMap = new HashMap<>();
		for (int i = 0; i < inputCoordinates.size(); i++) {
			tempMap.put("x" + (i + 1), inputCoordinates.get(i).getxAxis());
			tempMap.put("y" + (i + 1), inputCoordinates.get(i).getyAxis());
		}
		return calcDetail(tempMap);
	}

	public static double calcDetail(HashMap<String, Integer> tempMap) {
		return Math.sqrt(Math.pow((tempMap.get("x1") - tempMap.get("x2")), 2)
				+ Math.pow((tempMap.get("y1") - tempMap.get("y2")), 2));
	}

}
