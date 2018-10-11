package domain;

import util.PointException;

import java.util.*;

public abstract class Figure {
    protected List<Point> points;

    abstract public double evaluate() throws PointException;
    abstract public String stringFormat() throws PointException;
    abstract boolean isComputable() throws PointException;

    public List<Point> getPoints() {
        return Collections.unmodifiableList(points);
    }

}
