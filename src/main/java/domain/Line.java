package domain;

import static com.google.common.math.IntMath.pow;
import static java.lang.Math.sqrt;

public class Line {



    private double length;

    static double calculate(Points points) {
        double xPowers = pow(points.getX(0) - points.getX(1), 2);
        double yPowers = pow(points.getY(0) - points.getY(1), 2);
        double length = sqrt(xPowers + yPowers);
        return length;
    }
}
