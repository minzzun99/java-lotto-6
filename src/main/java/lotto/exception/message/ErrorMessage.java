package lotto.exception.message;

public enum ErrorMessage {
    PURCHASE_AMOUNT_ERROR("[ERROR] 로또 구매 금액이 1,000원으로 나누어 떨어지지 않습니다."),
    PURCHASE_INPUT_ERROR("[ERROR] 로또 구매 금액은 숫자로 입력해주세요.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
