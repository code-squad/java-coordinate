package com.zingoworks.coordinate.view;

import com.zingoworks.coordinate.domain.*;
import java.util.ArrayList;

import static com.zingoworks.coordinate.CoordinateMain.LENGTH_X;
import static com.zingoworks.coordinate.CoordinateMain.LENGTH_Y;

public class ResultView {
    private static final String VERTICAL = "│";
    private static final String NEW_LINE = System.getProperty("line.separator");

    public static void print(Coordinate coordinate) {
        printAxisY(coordinate.getPoint());
        printAxisX();
        System.out.print(NEW_LINE);

        if (coordinate.getPoint().size() == 2) {
            printDistance(new Line(coordinate.getPoint()));
        }

        if (coordinate.getPoint().size() == 3) {
            printAreaOfTriangle(new Triangle(coordinate.getPoint()));
        }

        if (coordinate.getPoint().size() == 4) {
            printAreaOfRectangle(new Rectangle(coordinate.getPoint()));
        }
    }

    private static void printAxisY(ArrayList<Point> point) {
        CoordinatePlane cp = new CoordinatePlane(point);
        for (int i = LENGTH_Y; i > 0; i--) {
            System.out.print(Axis.numberOfAxis(i) + VERTICAL);
            System.out.print(cp.getPlane().get(i - 1) + NEW_LINE);
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

    private static void printAreaOfTriangle(Triangle triangle) {
        System.out.println("삼각형의 넓이는 " + triangle.getArea() + "입니다.");
    }

    private static void printAreaOfRectangle(Rectangle rectangle) {
        System.out.println("사각형의 넓이는 " + rectangle.getArea() + "입니다.");
    }
}