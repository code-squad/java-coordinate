package domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FigureFactory {
    private enum Type {
        LINE(2), TRIANGLE(3), RECTANGLE(4);

        private int size;

        Type(int size) {
            this.size = size;
        }

        public static Type getType(int size) {
            for (Type value : values()) {
                if (value.size == size) return value;
            }
            throw new IllegalArgumentException("포인트 개수를 잘 못 입력했습니다.");
        }
    }

    private static Map<Type, FigureCreator> figures = new HashMap<>();

    static {
        figures.put(Type.LINE, points -> new Line(points));
        figures.put(Type.TRIANGLE, points -> new Triangle(points));
        figures.put(Type.RECTANGLE, points -> new Rectangle(points));
    }

    public static Figure decideFigure(List<Point> points) {
        Type type = Type.getType(points.size());
        return figures.get(type).create(points);
    }
}
