package model;

public abstract class AbstractFigures {
    public abstract double getValue();

    public static int exponent(int num) {
        return (int) Math.pow(num, 2);
    }
}
