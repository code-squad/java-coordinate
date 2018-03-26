package domain;

import java.util.List;

import static domain.FigureUtil.isLine;
import static domain.FigureUtil.isRectangle;
import static domain.FigureUtil.isTriangle;

public class concreteFigureMaker extends FigureMaker {

    public Figure createFigure(List<String> coordinates) {
        if (isLine(coordinates)) return Line.of(coordinates);
        if (isTriangle(coordinates)) return Triangle.of(coordinates);
        if (isRectangle(coordinates)) return Rectangle.of(coordinates);
        System.out.println("올바른 값을 넣어주세요.");
        throw new RuntimeException();
    }
}
