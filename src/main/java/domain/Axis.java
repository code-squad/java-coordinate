package domain;

public interface Axis {
    public static final int MAX_SIZE = 24;
    public static final String BLANK = "  ";
    abstract void initAxisBar();
    abstract void initAxisNum();
    abstract String stringFormat(int num);
}
