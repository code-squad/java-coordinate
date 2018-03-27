package domain;

import java.util.ArrayList;

public class Rectangle extends Shape {
    private static final int RECTANGLE = 4;
    private Line width;
    private Line height;

    public Rectangle(ArrayList<Point> points) {
        super(RECTANGLE);
        makeWidthHeight(LineList.getLines(points));
    }

    private void makeWidthHeight(ArrayList<Line> lines) {
        for (Line line: lines) {
            if (width != null && height != null) {
                break;
            }
            if (line.isWidth()) {
                width = line;
                continue;
            }
            if (line.isHeight()) {
                height = line;
                continue;
            }
        }
    }

    public Double getArea() {
        if(width == null) {
            System.out.println("width null");
        }
        if(height == null) {
            System.out.println("height null");
        }
        return width.getDistance() * height.getDistance();
    }

    public static Boolean isRectangle(ArrayList<Line> lines) {
        int width = 0;
        int height = 0;
        for (Line line : lines) {
            if(line.isWidth()) {
                width++;
            }
            if(line.isHeight()) {
                height++;
            }
        }
        if(width == 2 && height == 2) {
            return true;
        }
        return false;
    }
}
