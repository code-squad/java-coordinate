package coordinate;

import coordinate.domain.CoordinateManager;
import coordinate.view.PrintManager;

public class Main {
	public static void start() {
		printManagerStart(CoordinateManager.init());
	}

	public static void printManagerStart(CoordinateManager coordinateManager) {
		PrintManager.drawYaxis(coordinateManager);
		PrintManager.drawXaxis();
	}

	public static void main(String[] args) {
		start();
	}
}
