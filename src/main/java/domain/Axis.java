package domain;

public class Axis {
    private final static int AXIS_MAX = 24;
    private final static int AXIS_MIN = 0;
    private final static int Y_SPACE = 2;
    private final static int X_SPACE = 3;
    private final static String Y_LINE = "|";
    private final static String X_LINE = "---";

    private int axisX;
    private int axisY;

    public Axis() {
        this.axisX = AXIS_MIN;
        this.axisY = AXIS_MAX;
    }

    public int decreaseY() {
        return axisY--;
    }

    public int increaseX() {
        return axisX++;
    }

    public String axisFormatY(int axisVal) {
        if (axisVal % 2 == 0) {
            return String.format("%" + Y_SPACE + "d" + Y_LINE, axisVal);
        }
        return String.format("%" + Y_SPACE + "s" + Y_LINE, "");
    }

    public String axisFormatX(int axisVal) {
        if (axisVal % 2 == 0) {
            return String.format("%" + X_SPACE + "d", axisVal);
        }
        return String.format("%" + X_SPACE + "s", "");
    }

    public void printY() {
        while (axisY != AXIS_MIN) {
            System.out.println(axisFormatY(decreaseY()));
        }
        System.out.print(String.format("%" + Y_SPACE + "s+", ""));  // 원점
    }

    public void printX() {
        for (int i = 0; i < AXIS_MAX; i++) {
            System.out.print(X_LINE);
        }
        System.out.println();
        while (axisX != AXIS_MAX + 1) {
            System.out.print(axisFormatX(increaseX()));
        }
    }


}
