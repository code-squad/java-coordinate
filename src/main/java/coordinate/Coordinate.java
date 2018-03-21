package coordinate;

import java.util.List;

import coordinate.domain.CoordinateMake;
import coordinate.domain.Line;
import coordinate.domain.LineLength;
import coordinate.domain.MakeXY;
import coordinate.view.BoardView;
import coordinate.view.InputCoordinate;

public class Coordinate {
	public static void main(String[] args) {
		List<Integer> number = InputCoordinate.Input();
		MakeXY coordinate = new MakeXY(number);
		List<Integer> x = coordinate.getX();
		List<Integer> y = coordinate.getY();
		List<Line> lines = CoordinateMake.createLine(x, y);
		BoardView.makeBoard(lines);
		double length = LineLength.lineResult(x, y);
		BoardView.solveLine(length);
	}
}
// (20,5)-(12,6)