package coordinate;

import java.util.ArrayList;
import coordinate.domain.Coordinate;
import coordinate.domain.Frame;
import coordinate.view.Input;
import coordinate.view.Print;

public class Main {
	public static void start() {
		ArrayList<Coordinate> inputCoordinates = Input.inputCoordinate();
		Frame pointLines = Frame.init(inputCoordinates);
		printManagerStart(pointLines, inputCoordinates);
	}

	public static void printManagerStart(Frame pointLines, ArrayList<Coordinate> inputCoordinates) {
		Print.drawYaxis(pointLines);
		Print.drawXaxis();
		Print.printResult(inputCoordinates);
	}

	public static void main(String[] args) {
		start();
	}
}
