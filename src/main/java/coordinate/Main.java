package coordinate;

import java.util.ArrayList;
import java.util.HashMap;

import coordinate.domain.CoordinateManager;
import coordinate.view.InputManager;
import coordinate.view.PrintManager;

public class Main {
	public static void start() {
		ArrayList<HashMap<String, Integer>> inputCoordinates = InputManager.inputCoordinate();
		CoordinateManager pointLines = CoordinateManager.init(inputCoordinates);
		printManagerStart(pointLines, inputCoordinates);
	}

	public static void printManagerStart(CoordinateManager pointLines,
			ArrayList<HashMap<String, Integer>> inputCoordinates) {
		PrintManager.drawYaxis(pointLines);
		PrintManager.drawXaxis();
		PrintManager.printResult(inputCoordinates);
	}

	public static void main(String[] args) {
		start();
	}
}
