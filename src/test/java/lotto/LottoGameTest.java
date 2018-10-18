package lotto;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LottoGameTest {
    @Test
    public void 일등() {
        int rank = LottoGame.match("1,2,3,4,5,6",
                "1,2,3,4,5,6", "7");
        assertThat(rank).isEqualTo(1);
    }

    @Test
    public void 이등() {
        int rank = LottoGame.match("1,2,3,4,5,7",
                "1,2,3,4,5,6", "7");
        assertThat(rank).isEqualTo(2);
    }

    @Test
    public void 삼등() {
        int rank = LottoGame.match("1,2,3,4,5,7",
                "1,2,3,4,5,6", "8");
        assertThat(rank).isEqualTo(3);
    }

    @Test
    public void 사등() {
        int rank = LottoGame.match("1,2,3,4,8,9",
                "1,2,3,4,5,6", "8");
        assertThat(rank).isEqualTo(4);
    }

    @Test
    public void 오등() {
        int rank = LottoGame.match("1,2,3,8,9,10",
                "1,2,3,4,5,6", "8");
        assertThat(rank).isEqualTo(5);
    }

    @Test
    public void 꽝() {
        int rank = LottoGame.match("1,2,8,9,10,11",
                "1,2,3,4,5,6", "8");
        assertThat(rank).isEqualTo(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void 중복된_값() {
        LottoGame.match("1,2,2,4,5,6",
                "1,2,3,4,5,6", "7");
    }

    @Test(expected = IllegalArgumentException.class)
    public void 영_이하의_값() {
        LottoGame.match("0,2,2,4,5,6",
                "1,2,3,4,5,6", "7");
    }

    @Test(expected = IllegalArgumentException.class)
    public void 사십오_초과의_값() {
        LottoGame.match("1,2,3,4,5,46",
                "1,2,3,4,5,6", "7");
    }

    @Test(expected = IllegalArgumentException.class)
    public void 보너스값_중복() {
        LottoGame.match("1,2,3,4,5,6",
                "1,2,3,4,5,6", "6");
    }

}
