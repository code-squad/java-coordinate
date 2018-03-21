package domain.figure;

import domain.point.Points;

public abstract class Figure {
    Points pointRepo;

    Figure(Points pointRepo) {
        this.pointRepo = pointRepo;
    }

    public abstract int calcArea();

    public abstract String getFigureName();
}
