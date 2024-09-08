package lotto.exception;

import static lotto.exception.message.ErrorMessage.*;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class InputFormatValidator {
    // 구매 금액이 숫자로 입력됐는지 검증하고 숫자로 변환해서 return
    public int purchaseInput(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                throw new IllegalArgumentException(PURCHASE_INPUT_ERROR.getMessage());
            }
        }

        return Integer.parseInt(input);
    }

    public void inputNumberRange(int input) {

    }

    public List<Integer> winningLottoInput(String input) {
        input = input.replaceAll("\\s", "");        // 공백 제거
        StringTokenizer st = new StringTokenizer(input, ",");       // util 패키지를 하나 만들어야되나?
        List<Integer> number = new ArrayList<>();
        while (st.hasMoreTokens()) {
            number.add(Integer.parseInt(st.nextToken()));
        }
        return number;
    }
}
