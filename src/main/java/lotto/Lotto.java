package lotto;

import java.util.*;

public class Lotto {
    Set<LottoNumber> nos = new HashSet<>();

    private Lotto(String input) {
        String[] values = input.split(",");
        for (String value : values) {
            nos.add(new LottoNumber(value));
        }
        if (nos.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    public static Lotto createUserLotto(String input) {
        return new Lotto(input);
    }

    public static Lotto createGameLotto(String input, String bonus) {
        Lotto lotto = new Lotto(input);
        lotto.bonusDupicate(Integer.parseInt(bonus));
        return lotto;
    }

    public Rank matchNum(Lotto otherLotto, LottoNumber bonus) {
        int count = 0;
        for (LottoNumber number : nos) {
            if (otherLotto.nos.contains(number)) {
                count++;
            }
        }

        return new Rank(count, otherLotto.matchBonusNum(bonus));
    }

    public boolean matchBonusNum(LottoNumber bonus) {
        for (LottoNumber lottoNumber : nos) {
            if (lottoNumber == bonus) {
                return true;
            }
        }
        return false;
    }

    public void bonusDupicate(int bonusNumber) {
        for (LottoNumber number : nos) {
            if (nos.contains(bonusNumber))
                throw new IllegalArgumentException("보너스 번호가 중복 되었습니다.");
        }
    }
}
