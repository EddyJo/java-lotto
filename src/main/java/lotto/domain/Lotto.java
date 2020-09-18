package lotto.domain;

import java.util.List;

public class Lotto {

    private LottoNumbers lottoNumbers;
    private Rank rank;

    private Lotto(LottoNumbers lottoNumbers) {
        this.lottoNumbers = lottoNumbers;
    }

    public static Lotto of(List<Integer> lottoNums) {
        return new Lotto(LottoNumbers.create(lottoNums));
    }

    public void findLottoRank(List<Integer> winningLottoNumbers, int bounsNumber) {

        int matchCount = 0;

        for(Integer winningLottoNumber : winningLottoNumbers) {
            matchCount += getMatchCount(winningLottoNumber);
        }

        this.rank = Rank.create(matchCount, isMatchBoundsNumber(bounsNumber));
    }


    private int getMatchCount(Integer winningLottoNumber) {
        if(lottoNumbers.getLottoNumbers().stream().anyMatch(val -> val.isMatchNumber(winningLottoNumber))) {
            return 1;
        }

        return 0;
    }


    public boolean isMatchBoundsNumber(int bounsNumber) {
        if(getMatchCount(bounsNumber) == 1) {
            return true;
        }

        return false;
    }

    public LottoNumbers getLottoNumbers() {
        return this.lottoNumbers;
    }

    public Rank getRank() {
        return this.rank;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Lotto lotto = (Lotto) obj;
        return lottoNumbers == ((Lotto) obj).lottoNumbers;
    }
}
