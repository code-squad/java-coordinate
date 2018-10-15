package domain;

import util.Parser;
import util.PointException;
import view.AxisView;

public class PointFactory {
    public static Point create(String text) throws PointException {
        /* (1,1) */
        int x = Parser.parseInteger(splitText(removeChar(text), 0));
        int y = Parser.parseInteger(splitText(removeChar(text), 1));
        if(isValid(x) && isValid(y)) {
            return new Point(x, y);
        }
        return null;
    }

    public static boolean isValid(int num) throws PointException {
        if(num < 0 || num > AxisView.MAX_SIZE) {
            throw new PointException("좌표범위가 초과했습니다. 예) 0 이상 24 이하");
        }
        return true;
    }

    public static String removeChar(String text) {
        return text.replace("(", "").replace(")", "");
    }

    public static String splitText(String text, int index) {
        return text.split(",")[index];
    }
}
