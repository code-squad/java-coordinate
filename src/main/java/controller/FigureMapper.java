package controller;

import domain.Figure;

import java.util.HashMap;
import java.util.Map;

public class FigureMapper {
    public static final int NUM_FOR_LINE = 2;
    public static final int NUM_FOR_TRIANGLE = 3;
    public static final int NUM_FOR_SQUARE = 4;
    static final private Map<Integer, FigureFactory> figures = new HashMap<>();

    static {
        figures.put(NUM_FOR_LINE, new LineFactory());
        figures.put(NUM_FOR_TRIANGLE, new TriangleFactory());
        figures.put(NUM_FOR_SQUARE, new SquareFactory());
    }

    private FigureMapper() {
    }

    static public Figure get(int pointCount) {
        return figures.get(pointCount).create();
    }

}
