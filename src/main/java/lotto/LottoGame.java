package lotto;

public class LottoGame {
    public static int match(String user, String winning, String bonus) {
        Lotto userNum = Lotto.createUserLotto(user);
        Lotto gameNum = Lotto.createGameLotto(winning, bonus);

        LottoNumber bonusNumber = new LottoNumber(bonus);
        Rank count = userNum.matchNum(gameNum, bonusNumber);

        RankingMap rankingMap = new RankingMap();
        int result = rankingMap.getRank(count);

        return result;
    }
}
