package lotto.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toCollection;

public class LottoNumbers {

    private List<LottoNumber> lottoNumbers;

    public LottoNumbers(List<LottoNumber> lottoNumbers) {
        this.lottoNumbers = lottoNumbers;
    }

    public static LottoNumbers create(List<Integer> lottoNums) {

        return new LottoNumbers(lottoNums.stream().map(LottoNumber::of)
                                                  .collect(toCollection(ArrayList::new)));
    }

    public List<LottoNumber> getLottoNumbers() {
        return this.lottoNumbers;
    }

}
