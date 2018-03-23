package coordinate;

import coordinate.domain.Calculater;
import coordinate.domain.Coordinates;
import coordinate.domain.Frame;
import coordinate.view.Input;
import coordinate.view.Print;

public class Main {
	public static void start() {
		Coordinates inputCoordinates = Coordinates.of(Input.inputCoordinate());
		Frame pointLines = Frame.init(inputCoordinates);
		printManagerStart(pointLines, inputCoordinates);
	}

	public static void printManagerStart(Frame pointLines, Coordinates inputCoordinates) {
		Print.drawYaxis(pointLines);
		Print.drawXaxis();
		Print.printResult(inputCoordinates, new Calculater(inputCoordinates));
	}

	public static void main(String[] args) {
		start();
	}
}