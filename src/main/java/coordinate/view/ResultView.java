package coordinate.view;

import java.util.ArrayList;
import java.util.Collections;

public class ResultView {

    private static final String WIDTH_LINE = "│";
    private static final String BLANK = " ";
    private static final String HEIGHT_LINE = "─";

    static String input = "";

    public static void width(ArrayList<Integer> axisNum) {
        System.out.print(String.format("%3s", "+"));
        for (int i = 0; i < axisNum.size(); i++) {
            System.out.print(HEIGHT_LINE);
        }
        System.out.println();

        widthNum(axisNum);
    }

    private static void widthNum(ArrayList<Integer> axisNum) {
        for (Integer integer : axisNum) {
            input = String.format("%2s", BLANK);
            input = multiple(integer, input);
            System.out.print(input);
        }
    }

    public static void height(ArrayList<Integer> axisNum) {
        Collections.reverse(axisNum);

        for (int i = 0; i < axisNum.size() - 1; i++) {
            input = String.format("%2s", BLANK);
            input = multiple(axisNum.get(i), input);
            System.out.print(input);
            System.out.println(WIDTH_LINE);
        }
    }

    private static String multiple(int axisNum, String input) {
        if (axisNum % 2 == 0) {
            input = String.format("%2d", axisNum);
        }

        return input;
    }
}
