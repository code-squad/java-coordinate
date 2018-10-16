package controller;

import domain.Figure;
import domain.Triangle;

public class TriangleFactory implements FigureFactory {

    @Override
    public Figure create() {
        return new Triangle();
    }
}
