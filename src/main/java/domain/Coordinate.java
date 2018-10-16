package domain;

import util.PointException;

interface Coordinate {
    double area() throws PointException;
    boolean isComputable() throws PointException;
}
