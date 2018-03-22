package domain.figure;

import domain.point.Points;

public abstract class Figure {
    Points pointRepo;

    Figure(Points pointRepo) {
        this.pointRepo = pointRepo;
    }

    public abstract double calcArea();

    public abstract String getFigureName();
}
