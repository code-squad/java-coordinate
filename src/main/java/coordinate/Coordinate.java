package coordinate;

import java.util.List;

import coordinate.domain.Line;
import coordinate.domain.Point;
import coordinate.domain.CoordinatePoint;
import coordinate.view.BoardView;
import coordinate.view.InputCoordinate;

public class Coordinate {
	public static void main(String[] args) {
		String inputNumber = InputCoordinate.Input();

		CoordinatePoint point = new CoordinatePoint(inputNumber);
		double length = point.decideFigure();

		BoardView.makeBoard(point.getPoints());
		BoardView.solveLine(length);
	}
}