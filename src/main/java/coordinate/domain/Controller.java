package coordinate.domain;

import coordinate.view.PrintManager;

public class Controller {
	public static void start() {
		printManagerStart(CoordinateManager.init());
	}

	public static void printManagerStart(CoordinateManager coordinateManager) {
		PrintManager.drawYaxis(coordinateManager);
		PrintManager.drawXaxis();
	}
}
