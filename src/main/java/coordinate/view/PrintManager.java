package coordinate.view;

import coordinate.domain.Common;
import coordinate.domain.CoordinateManager;

public class PrintManager {

	public static void drawYaxis(CoordinateManager coordinateManager) {
		for (int i = coordinateManager.size() - 1; i > 0; i--) {
			System.out.print(coordinateManager.getLabel(i) + "|");
			System.out.println();
		}
	}

	public static void drawXaxis() {
		printXaxisBar();
		for (int i = 0; i < Common.MAXSIZE + 1; i++) {
			System.out.print(printxValue(i));
		}
	}

	public static void printXaxisBar() {
		System.out.print(Common.BLANK+"*");
		for (int i = 0; i < Common.MAXSIZE + 1; i++) {
			System.out.print("───");
		}
		System.out.println();
		System.out.print(Common.BLANK);
	}

	public static String printxValue(int i) {
		if (!Common.isOdd(i))
			return i + Common.BLANK;
		return Common.BLANK;
	}

}
