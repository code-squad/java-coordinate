package domain;

import java.util.Objects;

public class Val {
    public final static int VAL_MAX = 24;
    public final static int VAL_MIN = 0;
    private double v;

    public Val(double v) {
        if(v < VAL_MIN || v > VAL_MAX) {
            throw new IllegalArgumentException(VAL_MIN + "초과 " + VAL_MAX + "이하의 수를 입력해주세요");
        }
        this.v = v;
    }

    public double getV() {
        return v;
    }

    public double substract(Val w) {
        return v - w.v;
    }

    @Override
    public String toString() {
        return "Val{" +
                "v=" + v +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Val val = (Val) o;
        return Double.compare(val.v, v) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(v);
    }
}
