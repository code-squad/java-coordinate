package com.zingoworks.coordinate.view;

import com.zingoworks.coordinate.domain.*;
import java.util.ArrayList;

import static com.zingoworks.coordinate.CoordinateMain.LENGTH_X;
import static com.zingoworks.coordinate.CoordinateMain.LENGTH_Y;

public class ResultView {
    private static final String VERTICAL = "│";

    public static void print(Coordinate coordinate) {
        printAxisY(coordinate.getPoint());
        printAxisX();
        System.out.println("");

        if (coordinate.getPoint().size() == 2) {
            printDistance(new Line(coordinate.getPoint()));
        }

        if (coordinate.getPoint().size() == 4) {
            printArea(new Square(coordinate.getPoint()));
        }
    }

    private static void printAxisY(ArrayList<Point> point) {
        CoordinatePlane cp = new CoordinatePlane(point);
        for (int i = LENGTH_Y; i > 0; i--) {
            System.out.print(Axis.numberOfAxis(i) + VERTICAL);
            System.out.print(cp.getPlane().get(i - 1));
            System.out.println("");
        }
    }

    private static void printAxisX() {
        System.out.println(Axis.lineOfAxisX());
        System.out.print(" ");
        for (int i = 0; i <= LENGTH_X; i++) {
            System.out.print(Axis.numberOfAxis(i));
        }
    }

    private static void printDistance(Line line) {
        System.out.println("두 점 사이의 거리는 " + line.getDistanceOfLine() + "입니다.");
    }

    private static void printArea(Square square) {
        System.out.println("사각형의 넓이는 " + square.getAreaOfSquare() + "입니다.");
    }
}