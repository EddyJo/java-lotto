package lotto.domain;

import java.util.ArrayList;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toCollection;

public class LottoNumbers {

    ArrayList<LottoNumber> lottoNumbers;

    public LottoNumbers() { }

    public LottoNumbers(ArrayList<LottoNumber> lottoNumbers) {
        this.lottoNumbers = lottoNumbers;
    }

    public static LottoNumbers create(ArrayList<Integer> lottoNums) {

        return new LottoNumbers(lottoNums.stream().map( val -> LottoNumber.of(val))
                                                  .collect(toCollection(ArrayList::new)));
    }
}
