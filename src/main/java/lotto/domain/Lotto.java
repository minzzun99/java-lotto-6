package lotto.domain;

import static lotto.domain.message.DomainConstant.*;

import java.util.List;
import java.util.TreeSet;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validateNumbersSize(numbers);
        validateDuplication(numbers);
//        validateNumberRange(numbers);
        this.numbers = numbers;
    }

    // 숫자의 개수가 6이 아닌 경우
    private void validateNumbersSize(List<Integer> numbers) {
        if (numbers.size() != NUMBER_COUNT.getNumber()) {
            throw new IllegalArgumentException();
        }
    }

    // 중복된 숫자가 있는 경우
    private void validateDuplication(List<Integer> numbers) {
        TreeSet<Integer> set = new TreeSet<>(numbers);
        if (set.size() != NUMBER_COUNT.getNumber()) {
            throw new IllegalArgumentException();
        }
    }

    /*// 로또 숫자의 범위를 넘어간 경우 (InputFormatValidator에서 구현할지도?
    private void validateNumberRange(List<Integer> numbers) {
        for (int number : numbers) {
            if (number > END_RANGE.getNumber() && number < START_RANGE.getNumber()) {
                throw new IllegalArgumentException();
            }
        }
    }*/

    // TODO: 추가 기능 구현
    public List<Integer> getNumbers() {
        return numbers;
    }
}
