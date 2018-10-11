package domain;

import java.util.List;

public enum FigureMaker {
    DOT(1, new Dot()),
    LINE(2, new Line()),
    TRIANGLE(3, new Triangle()),
    RECTANGLE(4, new Rectangle());

    private int pointSize;
    private Figure figure;

    FigureMaker(int pointSize, Figure figure) {
        this.pointSize = pointSize;
        this.figure = figure;
    }

    public Figure init(List<Point> points) {
        return this.figure.init(points);
    }

    public static Figure checkFigure(List<Point> points) {
        for (FigureMaker figure : FigureMaker.values()) {
            if (figure.isMatchSize(points))
                return figure.init(points);
        }
        throw new IllegalArgumentException("Point 갯수가 너무 많습니다.");
    }

    private Boolean isMatchSize(List<Point> points) {
        return this.pointSize == points.size();
    }

}
