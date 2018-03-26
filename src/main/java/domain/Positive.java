package domain;

import java.util.Objects;

public class Positive {

    private int number;

    Positive(int num) {
        if (num < 0 || num > 24) {
            System.out.println("값은 0이상 24이하여야 합니다.");
            throw new RuntimeException();
        }
        number = num;
    }

    public int getDiff(Positive num) {
        return Math.abs(this.number - num.number);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Positive positive = (Positive) o;
        return number == positive.number;
    }

    @Override
    public int hashCode() {

        return Objects.hash(number);
    }
}
