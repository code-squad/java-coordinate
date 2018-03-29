package domain;

import java.util.List;

public class Rectangle extends Shape {
    private Line width;
    private Line height;

    public Rectangle(LineList lineList) {
        super(ShapeType.RECTANGLE);
        makeWidthHeight(lineList.getLines());
    }

    private void makeWidthHeight(List<Line> lines) {
        for (Line line : lines) {
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

    @Override
    public Double getArea() {
        if (width == null) {
            System.out.println("width null");
        }
        if (height == null) {
            System.out.println("height null");
        }
        return width.getDistance() * height.getDistance();
    }

    public static Boolean isRectangle(List<Line> lines) throws Exception {
        int width = 0;
        int height = 0;
        for (Line line : lines) {
            if (line.isWidth()) {
                width++;
            }
            if (line.isHeight()) {
                height++;
            }
        }
        if (width == 2 && height == 2) {
            return true;
        }
        throw new Exception("(선, 삼각형, 직사각형)을 만들 수 없는 좌표입니다.");
    }
}
