package domain;

import dto.PointDto;
import dto.ResultDto;

import java.util.ArrayList;
import java.util.List;

public class CoordCalculator {
    private List<Point> points;

    public CoordCalculator(List<Point> points) {
        this.points = points;
    }

    public List<PointDto> getPoints() {
        List<PointDto> pointsDto = new ArrayList<>();
        for (Point point : points) {
            pointsDto.add(point.makePointDto());
        }
        return pointsDto;
    }

    public ResultDto getLineDistance() {
        Point p1 = points.get(0);
        Point p2 = points.get(1);
        return new ResultDto(p1.calculateLineDistance(p2));
    }

}
