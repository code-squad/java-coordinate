package domain;

import util.PointException;

import java.util.*;

public interface Figure {
    double evaluate() throws PointException;
    List<Point> getPoints();
    String stringFormat() throws PointException;
    boolean isComputable();
}
