package domain;

import java.util.ArrayList;

public class Validation {
    public static Boolean checkValidation(ArrayList<Line> lines) throws Exception {
        if (lines.size() == 1) {

        }
        if (lines.size() == 3) {
            return Triangle.isTriangle(lines);
        }
        if (lines.size() == 6) {
            return Rectangle.isRectangle(lines);
        }
        return false;
    }

    private static Errors convertBoolToEnum(Boolean value) {
        if (!value) {
            return Errors.ERR_SHAPE;
        }
        return Errors.NOT_ERR;
    }
}
