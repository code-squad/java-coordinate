package domain.figure;

import domain.point.Points;

public class FigureCreator {

    public static Figure create(Points pointRepo) {
        if (pointRepo.isValidPointNum(Triangle.VALID_COORDINATE_NUM)) {
            return new Triangle(pointRepo);
        }
        return new Rectangle(pointRepo);
    }
}
