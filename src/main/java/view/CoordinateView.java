package view;

public class CoordinateView {
    private static final String VERTICAL_LINE = "│";
    private static final String HORIZONTAL_LINE = "──";
    private static final String CROSS = "+";
    private static final String BLANK = " ";
    private static final String ZERO = "0";
    private static final int LENGTH = 24;
    private static StringBuilder sb = new StringBuilder();

    private CoordinateView() {
    }

    private static void drawRow() {
        for (int i = LENGTH; i > 0; i--) {
            drawRowValue(i);
        }
    }

    private static void drawRowValue(int index) {
        if (index % 2 != 0) {
            sb.append(String.format("%2s", BLANK) + VERTICAL_LINE + String.format("%47s", BLANK) + '\n');
            return;
        }
        sb.append(String.format("%2s", index) + VERTICAL_LINE + String.format("%47s", BLANK) + '\n');
    }

    private static void drawXLine() {
        sb.append(String.format("%3s", CROSS));
        for (int i = 0; i < LENGTH; i++) {
            sb.append(HORIZONTAL_LINE);
        }
        sb.append('\n');
        drawXLineNum();
    }

    private static void drawXLineNum() {
        sb.append(String.format("%2s", ZERO) + BLANK);
        for (int i = 1; i <= LENGTH; i++) {
            if (i % 2 == 1) {
                sb.append(String.format("%2s", BLANK));
            }
            if (i % 2 == 0) {
                sb.append(String.format("%2s", i));
            }
        }
    }

    static void drawDot(int position) {
        sb.setCharAt(position, '●');
    }

    static void makeCoordinate() {
        drawRow();
        drawXLine();
    }

    static StringBuilder getCoordinateSb() {
        return sb;
    }
}