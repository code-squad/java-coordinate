package coordinates;

public class ResultView {

    private static final String STICK = "｜";
    private static final String HORIZONTAL = "￣";
    private static String biankNum = " ";

    public void graphHeightLine(int axis, boolean a) {
        String input = "";
        if (a == true) {
            input = String.valueOf(axis);
            System.out.print(HORIZONTAL);
            System.out.print(HORIZONTAL);
            System.out.print(input);
        }
    }

    public void graphWidthLine(int reversalAxis, boolean a) {
        String input = "";
        if (a == true) {
            input = String.valueOf(reversalAxis);
            System.out.print(String.format("%2d", reversalAxis));
            System.out.println(STICK);
            System.out.print(String.format("%3s", STICK));
        } else {
            System.out.println(biankNum);
        }
    }
}
