package controller;

import domain.Figure;
import domain.Square;

public class SquareFactory implements FigureFactory {

    @Override
    public Figure create() {
        return new Square();
    }
}
