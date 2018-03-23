package domain;

import java.util.ArrayList;
import java.util.Collections;

public class Line {
//    public ArrayList<Boolean> marks;
    Double length;

    public Line(Point a, Point b) {

    }

    public Double calculateDistance(Point a, Point b) {
        int aX = a.getX();
        int aY = a.getY();
        int bX = b.getX();
        int bY = b.getY();
        this.length = Math.sqrt(Math.pow((aX - bX), 2) + Math.pow((aY - bY), 2));
        return this.length;
    }

    public Double getLength() {
        return length;
    }

    //    private Line() {
//        this.marks = new ArrayList<>(Collections.nCopies(24, false));
//    }
//
//    public static void addLine(int x, int y, ArrayList<Line> lines) {
//        Line line = new Line();
//        if(!isEmpty(lines, y)) { // todo 부정문 -> 긍정문
//            line = lines.get(y);
//        }
//        markPoint(x, line);
//        lines.set(y,line);
//    }
//
//    private static boolean isEmpty(ArrayList<Line> lines, int y) {
//        if(lines.get(y) == null) {
//            return true;
//        }
//        return false;
//    }
//
//    private static void markPoint(int x, Line line) {
//        line.marks.set(x, true);
//    }
//
//    public ArrayList<Boolean> getMarks() {
//        return marks;
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("marks : ");
//        for (Boolean mark : marks) {
//            sb.append(mark.toString());
//            sb.append(" ");
//        }
//        return sb.toString();
//    }
}
