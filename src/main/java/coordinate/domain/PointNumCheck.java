package coordinate.domain;

import coordinate.view.OutputCoordinate;
import coordinate.view.PrintResult;

import java.util.ArrayList;

public class PointNumCheck {

    public void resultByPointNum(int numOfPoints, ArrayList<String> points) {
        if (numOfPoints == 2) {
            Figure line = new Line(points);
            OutputCoordinate.printCoordinate(points, numOfPoints);
            PrintResult.printLineResult(line);
        }

        if (numOfPoints == 3) {
            Figure triangle = new Triangle(points);
            OutputCoordinate.printCoordinate(points, numOfPoints);
            PrintResult.printTriangleResult(triangle);
        }

        if (points.size() == 4) {
            Figure square = new Square(points);
            OutputCoordinate.printCoordinate(points, numOfPoints);
            PrintResult.printSquareResult(square);
        }
    }
}
