package controller;

import domain.Figure;
import domain.Line;

public class LineFactory implements FigureFactory {

    @Override
    public Figure create() {
        return new Line();
    }
}
