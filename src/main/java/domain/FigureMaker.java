package domain;

import java.util.List;

public abstract class FigureMaker {

    public Figure initFigure(List<String> coordinates) {
        return createFigure(coordinates);
    }

    abstract Figure createFigure(List<String> coordinates);
}
