package domain;

import java.util.List;

public class Validation {
    public static Boolean checkValidation(List<Line> lines) throws Exception {
        if (lines.size() == 1) {
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
