package domain;

public class Positive {

    private int number;

    public Positive(int num) {
        if (num < 0 || num > 24) {
            System.out.println("값은 0이상 24이하여야 합니다.");
            throw new RuntimeException();
        }
        number = num;
    }

    public int getNumber() {
        return number;
    }

    public int getWidth(Positive x) {
        return Math.abs(number - x.number);
    }

    public int getHeight(Positive y) {
        return Math.abs(number - y.number);
    }
}
