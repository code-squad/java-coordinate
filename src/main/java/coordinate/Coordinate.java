package coordinate;

import java.util.List;

import coordinate.domain.Line;
import coordinate.domain.Point;
import coordinate.domain.CoordinatePoint;
import coordinate.domain.Figure;
import coordinate.view.BoardView;
import coordinate.view.InputCoordinate;

public class Coordinate {
	public static void main(String[] args) {
		String[] inputNumber = InputCoordinate.Input();

		CoordinatePoint point = new CoordinatePoint(inputNumber);
		Figure figure = point.decideFigure();
		double area = figure.area();

		BoardView.makeBoard(point.getPoints());
		BoardView.printArea(area, point.getPoints());
	}
}