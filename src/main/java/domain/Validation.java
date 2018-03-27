package domain;

import java.util.ArrayList;

public class Validation {
    public static Boolean checkValidation(ArrayList<Line> lines) {
        if (!PointList.hasNull()) {
            return true;
        }
        if (lines.size() == 3) {
            return Triangle.isTriangle(lines);
        }
        if (lines.size() == 6) {
            return Rectangle.isRectangle(lines);
        }
        return false;
    }
}
