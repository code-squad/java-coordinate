package view;

public class CoordinateView {
    static final String VERTICAL_LINE = "│";
    static final String HORIZONTAL_LINE = "──";
    static final String CROSS = "+";
    static final String BLANK = " ";
    static final String ZERO = "0";
    static final int LENGTH = 24;
    private StringBuilder sb = new StringBuilder();

    public void drawRow() {
        for (int i = LENGTH; i > 0; i--) {
            drawRowValue(i);
        }
    }

    public void drawRowValue(int index) {
        if (index % 2 != 0) {
            sb.append(String.format("%2s", BLANK) + VERTICAL_LINE + String.format("%47s", BLANK) + '\n');
            return;
        }
        sb.append(String.format("%2s", index) + VERTICAL_LINE + String.format("%47s", BLANK) + '\n');
    }

    public void drawXLine() {
        sb.append(String.format("%3s", CROSS));
        for (int i = 0; i < LENGTH; i++) {
            sb.append(HORIZONTAL_LINE);
        }
        sb.append('\n');
        drawXLineNum();
    }

    public void drawXLineNum() {
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

    public void drawDot(int position) {
        sb.setCharAt(position, '●');
    }

    public void makeCoordinate() {
        drawRow();
        drawXLine();
    }

    public StringBuilder getCoordinateSb() {
        return sb;
    }
}