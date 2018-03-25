package domain;

import java.util.List;

import static domain.FigureUtil.isLine;

public class Line extends Figure {

    Line(List<String> coordinates) {
        super.points = Points.initCoordinates(coordinates);
    }

    public static Figure createFigure(List<String> coordinates){
        if (!isLine(coordinates)){
            throw new RuntimeException();
        }
        return new Line(coordinates);
    }



    @Override
    public void calculate() {
        super.area = super.points.calculateLine();
    }

    @Override
    public String toString() {
        return "Line";
    }

}
