package domain;

import dto.PointDto;
import dto.ResultDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordCalculator {
    public static final int NUM_FOR_LINE = 2;
    public static final int NUM_FOR_TRIANGLE = 3;
    public static final int NUM_FOR_SQUARE = 4;
    static private Map<Integer, Figure> figures = new HashMap<>();
    private List<Point> points;

    static {
        figures.put(NUM_FOR_LINE, new Line());
        figures.put(NUM_FOR_TRIANGLE, new Triangle());
        figures.put(NUM_FOR_SQUARE, new Square());
    }

    public CoordCalculator(List<Point> points) {
        this.points = points;
    }

    public ResultDto calculate() {
        List<PointDto> pointsDto = new ArrayList<>();
        for (Point point : points) {
            pointsDto.add(point.makePointDto());
        }

        try {
            int pointsCount = points.size();
            return new ResultDto(figures.get(pointsCount).area(points), pointsDto);
        } catch(Exception e) {
            return new ResultDto(pointsDto);
        }

    }

}
