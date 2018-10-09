package domain;

import util.PointException;

import java.util.*;

public interface Figure {
    String evaluate();
    List<Point> getPoints();
    String stringFormat(Number value);
}
