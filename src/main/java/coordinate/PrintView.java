package coordinate;

public class PrintView {
    private static final String VERTICAL = "│";
    private static final String ZERO_POINT = "┼";
    private static final String ROW = "───";
    private static final String BLANK = " ";    //1칸
    private static final String BLANK_TWO = "  ";
    private static final String BLANK_FOUR = "    ";
    private static final int AXIS_MAX = 24;


    public static void drawVertical() {
        for (int i = AXIS_MAX; i > 0; i--) {
            if (i % 2 == 1) {
                System.out.print(BLANK_TWO);
                System.out.println(VERTICAL);
                continue;
            }
            if (i < 10)
                System.out.print(BLANK);
            System.out.print(i);
            System.out.println(VERTICAL);
        }
    }

    public static void drawRow() {
        System.out.print(BLANK_TWO);
        System.out.print(ZERO_POINT);
        for (int i = 0; i < AXIS_MAX-1; i++) {
            System.out.print(ROW);
        }
        System.out.println();
    }

    public static void rowNumber() {
        System.out.print(BLANK_TWO);
        System.out.print("0");
        for (int i = 1; i <= AXIS_MAX; i++) {
            if (i % 2 == 0) {
                System.out.print(BLANK_FOUR);
                System.out.print(i);
            }
        }
    }


}
