package domain;

import java.util.List;

public enum FigureMaker implements FigureFactory {
    DOT(1) {
        @Override
        public Figure create(List<Point> points) {
            return new Dot(points);
        }
    },
    LINE(2) {
        @Override
        public Figure create(List<Point> points) {
            return new Line(points);
        }
    },
    TRIANGLE(3) {
        @Override
        public Figure create(List<Point> points) {
            return new Triangle(points);
        }
    },
    RECTANGLE(4) {
        @Override
        public Figure create(List<Point> points) {
            return new Rectangle(points);
        }
    };

    private int pointSize;

    FigureMaker(int pointSize) {
        this.pointSize = pointSize;
    }

    public static Figure init(List<Point> points) {
        return FigureMaker.findFigure(points.size()).create(points);
    }

    public static FigureMaker findFigure(int size) {
        for (FigureMaker fm : FigureMaker.values()) {
            if(size == fm.pointSize) {
                return fm;
            }
        }
        throw new IllegalArgumentException("Point 갯수가 너무 많습니다.");
    }

}
