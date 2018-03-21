package domain.figure;

import domain.point.Points;

public class FigureCreator {

    public static Figure create(Points pointRepo) {
        if (Triangle.VALID_COORDINATE_NUM == pointRepo.getSavedSize()) {
            return new Triangle(pointRepo);
        }
        return new Rectangle(pointRepo);
    }
}
