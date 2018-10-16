package domain;

import dto.PointDto;

import java.util.ArrayList;
import java.util.List;

public class PointDtoFactory {
    static private List<PointDto> pointsDto = new ArrayList<>();

    private PointDtoFactory() {
    }

    static List<PointDto> create(List<Point> points) {
        for (Point point : points) {
            pointsDto.add(point.addPointDto());
        }
        return pointsDto;
    }
}
