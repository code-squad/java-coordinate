package coordinate.domain;

public interface Calculable {
    double calculate();

    boolean isMatch(int x, int y);

    boolean isDuplicate();

    String getType();
}
