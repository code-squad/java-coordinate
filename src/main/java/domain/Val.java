package domain;

import java.util.Objects;

public class Val {
    public final static int VAL_MAX = 24;
    public final static int VAL_MIN = 0;
    private int v;

    public Val(int v) {
        if(v < VAL_MIN || v > VAL_MAX) {
            throw new IllegalArgumentException();
        }
        this.v = v;
    }

    public int getV() {
        return v;
    }

    public int substract(Val w) {
        return v - w.v;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Val val = (Val) o;
        return v == val.v;
    }

    @Override
    public int hashCode() {
        return Objects.hash(v);
    }

}
