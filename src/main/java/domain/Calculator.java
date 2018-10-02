package domain;

import dto.PointDto;

import java.util.List;

public class Calculator {

    public static double twoPointsDistance(List<PointDto> points) {
        return Math.sqrt(Math.pow((points.get(0).getX() - points.get(1).getX()), 2) + Math.pow((points.get(0).getY() - points.get(1).getY()), 2));
    }

}
