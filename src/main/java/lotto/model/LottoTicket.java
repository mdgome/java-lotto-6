package lotto.model;

import java.util.ArrayList;
import java.util.List;

public class LottoTicket {
    private final List<Lotto> lottoTicket;

    protected LottoTicket(List<Lotto> lottoTicket) {
        this.lottoTicket = new ArrayList<>(lottoTicket);
    }

    protected static LottoTicket createLottoTicket(int count) {

    }

    public WinStatistics getRank(Lotto winLotto, Bonus bonus) {
        WinStatistics winStatistics = new WinStatistics();

        lottoTicket.forEach(
                lotto -> {
                    Rank rank = lotto.getRank(winLotto, bonus);
                    winStatistics.pushRank(rank);
                }
        );

        return winStatistics;
    }

    public String printResult() {

    }
}
