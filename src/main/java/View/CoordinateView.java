package View;

public class CoordinateView {
    static final String VERTICAL_LINE = "│";
    static final String HORIZONTAL_LINE = "──";
    static final String CROSS = "+";
    static final String BLANK = " ";
    static final String ZERO = "0";
    static final int LENGTH = 24;

    public static void drawYLine() {
        for (int i = LENGTH; i > 0; i--) {
            if (i % 2 != 0) {
                System.out.println(String.format("%2s", BLANK) + VERTICAL_LINE);
                continue;
            }
            System.out.println(String.format("%2s", i) + VERTICAL_LINE);
        }
    }

    public static void drawXLine() {
        System.out.print(String.format("%3s", CROSS));
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(HORIZONTAL_LINE);
        }
        System.out.println();
        drawXLineNum();
    }

    public static void drawXLineNum() {
        System.out.print(String.format("%2s", ZERO) + BLANK);
        for (int i = 1; i <= LENGTH; i++) {
            if (i % 2 != 0) {
                System.out.print(String.format("%2s", BLANK));
                continue;
            }
            System.out.print(String.format("%2s", i));
        }
    }
}