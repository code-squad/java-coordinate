package coordinates.view;

import coordinates.domain.Point;

public class ResultView {

    private static final String STICK = "｜";
    private static final String HORIZONTAL = "￣";
    private static final String POINT = "ㆍ";
    private static String biankNum = " ";


    public void graphHeightLine(int axis, boolean blank) {
        String input = "";
        if (blank == true) {
            input = String.valueOf(axis);
            System.out.print(HORIZONTAL);
            System.out.print(HORIZONTAL);
            System.out.print(input);
        }
    }

    public void max(int reversalAxis, boolean blank){
        if (blank == true) {
            System.out.print(String.format("%2d", reversalAxis));
            System.out.print(STICK);
        } else {
            System.out.println(biankNum);
            System.out.println(String.format("%3s", STICK));
        }
    }

    public void graphWidthLine(int reversalAxis, boolean blank, int pointSize,boolean x, boolean y) {
        if (blank == true) {
            System.out.print(String.format("%2d", reversalAxis));
            System.out.print(STICK);


        } else {
            System.out.println(biankNum);
            System.out.println(String.format("%3s", STICK));
        }
    }

    public void noGraphWidthLine(){
        System.out.println(biankNum);
        System.out.print(String.format("%3s", STICK));
        System.out.println();
    }

    public void mathPrint(double point){
        System.out.println("두 점 사이 거리는 "+point);
    }

}
