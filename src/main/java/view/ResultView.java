package view;

import domain.Point;
import domain.Points;

import java.util.List;

public class ResultView {

    public static final String FIRSTNONE = "| ";
    public static final String BODYEXIST = "* ";
    public static final String BODYNONE = "  ";
    public static final String LASTEXIST = "-*";
    public static final String LASTNONE = "--";
    public static final String LASTFIRSTNONE = "+";
    public static final String LASTFIRSTEXIST = "*";

    public static void drawGraph(Points points) {
        for (int i = Point.MAXSIZE; i >= Point.MINSIZE; i--) {
            System.out.println(drawLine(i, points.makeLine(i)));
        }
        System.out.println(onlyNumLine(Point.MAXSIZE));
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
        if (point == Points.EXIST) {
            return BODYEXIST;
        }
        return FIRSTNONE;
    }

    public static String checkNone(int point) {
        if (point == Points.NONE) {
            return BODYNONE;
        }
        return BODYEXIST;
    }

    public static String drawPoint(int x, int point) {
        if (x == Point.MINSIZE) {
            return checkFirst(point);
        }
        return checkNone(point);
    }

    public static String checkLastFirst(int point) {
        if (point == Points.EXIST) {
            return LASTFIRSTEXIST;
        }
        return LASTFIRSTNONE;
    }

    public static String checkLastNone(int point) {
        if (point == Points.NONE) {
            return LASTNONE;
        }
        return LASTEXIST;
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

    public static void printDistance(double distance) {
        System.out.println("두 점 사이의 거리는 " + distance);
    }

}