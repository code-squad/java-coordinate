package com.zingoworks.coordinate.view;

import com.zingoworks.coordinate.domain.*;
import java.util.List;

import static com.zingoworks.coordinate.CoordinateMain.LENGTH_X;
import static com.zingoworks.coordinate.CoordinateMain.LENGTH_Y;

public class ResultView {
    private static final String VERTICAL = "│";
    private static final String NEW_LINE = System.getProperty("line.separator");

    public static void print(List<Point> points) {
        printAxisY(points);
        printAxisX();
        System.out.print(NEW_LINE);

        if (points.size() == 2) {
            printDistance(new Line(points));
        }

        if (points.size() == 3) {
            printArea(new Triangle(points));
        }

        if (points.size() == 4) {
            printArea(new Rectangle(points));
        }
    }

    private static void printAxisY(List<Point> point) {
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

    private static void printArea(Area area) {
        System.out.println(area.getFigure() + "의 넓이는 " + area.getArea() + "입니다.");
    }
//    인터페이스 구현으로 불필요해짐(?)
//    private static void printAreaOfRectangle(Rectangle rectangle) {
//        System.out.println("사각형의 넓이는 " + rectangle.getArea() + "입니다.");
//    }
}