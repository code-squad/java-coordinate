package domain;

public class Validation {

    public static Boolean hasNull(CoordinateBase coordinateBase) {
        return coordinateBase.points.contains(null);
    }
}
