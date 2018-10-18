package lotto;

public class LottoNumber {
    private int no;

    public LottoNumber(int no) {
        if (no < 1 || no > 45) {
            throw new IllegalArgumentException();
        }
        this.no = no;
    }

    public LottoNumber(String no) {
        this(Integer.parseInt(no));
    }
}
