package domain.figure;

import domain.point.Points;

public class Triangle extends Figure {
    public static final int VALID_COORDINATE_NUM = 3;

    Triangle(Points pointRepo) {
        super(pointRepo);
    }

    @Override
    public int calcArea() {
        return 0;
    }

    @Override
    public String getFigureName() {
        return "삼각형";
    }
}
