package view;

import domain.*;

import java.util.List;

public class ResultView {

    public static final String FIRST_NONE = "| ";
    public static final String BODY_EXIST = "* ";
    public static final String BODY_NONE = "  ";
    public static final String LAST_EXIST = "-*";
    public static final String LAST_NONE = "--";
    public static final String LAST_FIRST_NONE = "+";
    public static final String LAST_FIRST_EXIST = "*";

    public static String drawGraph(Figure points) {
        StringBuilder sb = new StringBuilder();

        for (int i = Point.MAXSIZE; i >= Point.MINSIZE; i--) {
            sb.append(drawLine(i, points.makeLine(i)) + "\n");
        }
        sb.append(onlyNumLine(Point.MAXSIZE));
        return sb.toString();
    }

    public static String drawLine(int y, List<Integer> points) {
        if (y == Point.MINSIZE) {
            return drawLastLine(points);
        }
        return drawBodyLine(y, points);
    }

    public static String drawBodyLine(int y, List<Integer> points) {
        StringBuilder sb = new StringBuilder();

        sb.append(makeNumIndent(y));
        for (int i = 0; i < Point.MAXSIZE; i++) {
            sb.append(drawPoint(i, points.get(i)));
        }
        return sb.toString();
    }

    public static String checkFirst(int point) {
        if (point == Figure.EXIST) {
            return BODY_EXIST;
        }
        return FIRST_NONE;
    }

    public static String checkNone(int point) {
        if (point == Figure.NONE) {
            return BODY_NONE;
        }
        return BODY_EXIST;
    }

    public static String drawPoint(int x, int point) {
        if (x == Point.MINSIZE) {
            return checkFirst(point);
        }
        return checkNone(point);
    }

    public static String checkLastFirst(int point) {
        if (point == Figure.EXIST) {
            return LAST_FIRST_EXIST;
        }
        return LAST_FIRST_NONE;
    }

    public static String checkLastNone(int point) {
        if (point == Figure.NONE) {
            return LAST_NONE;
        }
        return LAST_EXIST;
    }

    public static String drawLastPoint(int idx, int point) {
        if (idx == 0) {
            return checkLastFirst(point);
        }
        return checkLastNone(point);
    }

    public static String drawLastLine(List<Integer> points) {
        StringBuilder sb = new StringBuilder();

        sb.append("  ");
        for (int i = 0; i < points.size(); i++) {
            sb.append(drawLastPoint(i, points.get(i)));
        }
        return sb.toString();
    }

    public static String makeNumIndent(int i) {
        if (i % 2 == 0) {
            return numSizeIndent(i);
        }
        return "  ";
    }

    public static String numSizeIndent(int i) {
        if (i > 9) {
            return String.valueOf(i);
        }
        return " " + i;
    }

    public static String onlyNumLine(int size) {
        StringBuilder sb = new StringBuilder();

        sb.append(" 0 ");
        for (int i = 1; i <= size; i++) {
            sb.append(makeNumIndent(i));
        }
        return sb.toString();
    }

}