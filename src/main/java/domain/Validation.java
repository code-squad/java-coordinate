package domain;

import java.util.ArrayList;

public class Validation {
    public static Boolean checkValidation(ArrayList<Line> lines) {
        if (PointList.hasNull()) {
            return false;
        }
        if (lines.size() == 3) {
            // triangle validation check
        }
        if (lines.size() == 6) {
            return Rectangle.isRectangle(lines);
        }
        return false;
    }
}
