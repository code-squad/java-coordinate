package domain;

import java.util.ArrayList;
import java.util.Collections;

public class Line {
    public ArrayList<Boolean> marks;

    private Line() {
        this.marks = new ArrayList<>(Collections.nCopies(24, false));
//        System.out.println("marks size " + marks.size());
    }

    // lines에서 y좌표에 해당하는 line 얻기
    public static void addLine(int x, int y, ArrayList<Line> lines) {
        Line line = new Line();
        if(!isEmpty(lines, y)) { // todo 부정문 -> 긍정문
            line = lines.get(y);
        }
        markPoint(x, line);
//        lines.add(y, line); //add를 하게 되면 2번째 좌표부터 칸이 밀려난다. overwrite 지원하지 않나? add 파라미터 확인
        lines.set(y,line);
        // todo 이미 생성된 라인이 있다면 기존의 라인을 가져와서 안에 있는 marks의 칸에다가 표기.
        // 생성된 라인이 있는지 체크하지 않으니깐, 두 번째 좌표부터는 칸이 밀린다. y축 좌표가.

    }

    private static boolean isEmpty(ArrayList<Line> lines, int y) {
        if(lines.get(y) == null) {
            return true;
        }
        return false;
    }

    // 찾은 y좌표 라인의 x좌표 칸에 해당하는 곳 표시(mark)하기
    private static void markPoint(int x, Line line) {
        //line.marks.add(x, true); // add하면서 x축 좌표 밀려남
        line.marks.set(x, true);
    }

    public ArrayList<Boolean> getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("marks : ");
        for (Boolean mark : marks) {
            sb.append(mark.toString());
            sb.append(" ");
        }
        return sb.toString();
    }
}
