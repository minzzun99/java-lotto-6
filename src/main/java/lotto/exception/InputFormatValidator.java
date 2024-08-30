package lotto.exception;

import static lotto.exception.message.ErrorMessage.*;

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
}
