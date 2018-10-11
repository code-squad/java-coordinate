package domain;

import dto.PointDto;
import dto.ResultDto;

import java.util.ArrayList;
import java.util.List;

public class CoordCalculator {
    public static final int NUM_FOR_LINE = 2;
    private List<Point> points;

    public CoordCalculator(List<Point> points) {
        this.points = points;
    }

    public ResultDto calculate() {
        List<PointDto> pointsDto = new ArrayList<>();
        for (Point point : points) {
            pointsDto.add(point.makePointDto());
        }

        if(pointsDto.size() == NUM_FOR_LINE) {
            return new ResultDto(points.get(0).calculateLineDistance(points.get(1)), pointsDto);
        }

        try{
            return new ResultDto(Square.calculateWide(points), pointsDto);
        } catch(Exception e) {
            return new ResultDto(pointsDto);
        }
    }

}
