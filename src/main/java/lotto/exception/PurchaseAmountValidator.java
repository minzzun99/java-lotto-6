package lotto.exception;

import static lotto.exception.message.ErrorMessage.PURCHASE_AMOUNT_ERROR;

public class PurchaseAmountValidator {
    public PurchaseAmountValidator(int price) {
        if (price % 1000 != 0) {
            throw new IllegalArgumentException(PURCHASE_AMOUNT_ERROR.getMessage());
        }
    }
}
