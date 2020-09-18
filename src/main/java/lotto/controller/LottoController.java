package lotto.controller;

import lotto.domain.LottoCreater;
import lotto.domain.LottoResult;
import lotto.domain.Lottos;

import java.util.ArrayList;
import java.util.List;

public class LottoController {

    public Lottos lottos;

    public void purchaseLotto(int purchaseAmount) {
        this.lottos = LottoCreater.issueLottos(purchaseAmount);
    }

    public int getLottoCount() {
        return this.lottos.getLottos().size();
    }

    public void checkWinningNumeber(List<Integer> winningNumbers, int bonusNumber) {

        lottos.checkWinningNumbers(winningNumbers, bonusNumber);
    }

    public Lottos getLottos() {
        return this.lottos;
    }

    public LottoResult getLottoResult() {
        return LottoResult.create(lottos);
    }

}
