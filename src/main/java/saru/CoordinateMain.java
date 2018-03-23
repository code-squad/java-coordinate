package saru;

import saru.domain.*;
import saru.view.*;

import java.util.*;

public class CoordinateMain {
    public static void main(String[] args) {
        CoordinateCalc coordinateCalc = new CoordinateCalc();
        coordinateCalc.InitLines();
        List<Line> lines = coordinateCalc.getLines();
        coordinateCalc.drawPoint(10, 10);
        coordinateCalc.drawPoint(4, 4);
        coordinateCalc.drawPoint(0, 1);
        coordinateCalc.drawPoint(7, 0);

        Output output = new Output(lines);
        output.printVerticalAxis();
        output.printHorizontalAxis();

        Point point1 = new Point(3, 3, true);
        Point point2 = new Point(4, 4, true);

        System.out.println(coordinateCalc.calcLine(point1, point2));
    }
}