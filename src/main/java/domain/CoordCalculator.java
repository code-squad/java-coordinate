package domain;

import controller.FigureMapper;
import dto.PointDto;
import dto.ResultDto;

import java.util.List;

public class CoordCalculator {
    private List<Point> points;

    public CoordCalculator(List<Point> points) {
        this.points = points;
    }

    public ResultDto calculate() {
        List<PointDto> pointsDto = PointDtoFactory.create(points);

        try {
            return new ResultDto(FigureMapper.get(points).area(), pointsDto);
        } catch(Exception e) {
            return new ResultDto(pointsDto);
        }

    }

}
