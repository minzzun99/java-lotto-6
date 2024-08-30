package lotto.domain;

import static lotto.domain.message.DomainConstant.*;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import lotto.exception.PurchaseAmountValidator;

public class RandomNumberGenerator {
    public List<Lotto> generate(int price) {
        // 검증
        new PurchaseAmountValidator(price);
        int generateCounts = price / LOTTO_PRICE.getNumber();

        // 랜덤 숫자 생성
        List<Lotto> numbers = new ArrayList<>();
        while (generateCounts-- > 0) {
            numbers.add(generateRandomNumbers());
        }

        return numbers;
    }

    private Lotto generateRandomNumbers() {
        TreeSet<Integer> numberSet = new TreeSet<>();
        while (numberSet.size() != NUMBER_COUNT.getNumber()) {
            numberSet.add(Randoms.pickNumberInRange(START_RANGE.getNumber(), END_RANGE.getNumber()));
        }

        return new Lotto(new ArrayList<>(numberSet.stream().toList()));
    }
}
