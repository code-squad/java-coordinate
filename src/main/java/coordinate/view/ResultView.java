package coordinate.view;

public class ResultView {
    public static void createLocationAxis(){
        final int AXIS_MAX = 24;
        final String X_BAR = "━━";
        final char Y_BAR = '│';
        final char ZERO_BAR = '+';
        final String BLANK = "  ";

        createYAxis(AXIS_MAX, Y_BAR, BLANK);
        createXAxis(AXIS_MAX, X_BAR, ZERO_BAR, BLANK);
    }

    private static void createYAxis(int AXIS_MAX, char y_BAR, String BLANK) {
        for (int i = 0; i < AXIS_MAX; i++) {
            if(i % 2 == 0){
                System.out.printf("%2d", AXIS_MAX - i);
                System.out.println(y_BAR);
                continue;
            }
            System.out.println(BLANK + y_BAR);
        }
    }

    private static void createXAxis(int AXIS_MAX, String x_BAR, char ZERO_BAR, String BLANK) {
        drawXLine(AXIS_MAX, x_BAR, ZERO_BAR, BLANK);

        for (int i = 0; i <= AXIS_MAX; i++) {
            if(i % 2 == 0){
                System.out.print(BLANK + i);
            }
        }
    }

    private static void drawXLine(int AXIS_MAX, String x_BAR, char ZERO_BAR, String BLANK) {
        System.out.print(BLANK + ZERO_BAR);
        for (int i = 0; i < AXIS_MAX -2; i++) {
            System.out.print(x_BAR);
        }
        System.out.println();
    }

}
