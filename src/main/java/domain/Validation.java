package domain;

import java.util.ArrayList;

public class Validation {
    public static Errors checkValidation(ArrayList<Line> lines) {
        if (lines.size() == 1) {
            return Errors.NOT_ERR;
        }
        if (lines.size() == 3) {
            return convertBoolToEnum(Triangle.isTriangle(lines));
        }
        if (lines.size() == 6) {
            return convertBoolToEnum(Rectangle.isRectangle(lines));
        }
        return Errors.ERR_SHAPE;
    }

    private static Errors convertBoolToEnum(Boolean value) {
        if (!value) {
            return Errors.ERR_SHAPE;
        }
        return Errors.NOT_ERR;
    }
}
