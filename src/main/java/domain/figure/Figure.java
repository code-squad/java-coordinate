package domain.figure;

import java.util.List;

public interface Figure {
    double calcArea();

    List<Double> getSidesLength();

    String getFigureName();
}
