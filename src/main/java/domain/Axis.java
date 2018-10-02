package domain;

public interface Axis {
    public static final int MAX_SIZE = 24;
    public static final String BLANK = "  ";

    abstract void initAxisBar();
    abstract void initAxisNum();

    default String stringFormat(int num) {
        return String.format("%2d", num);
    }

}
