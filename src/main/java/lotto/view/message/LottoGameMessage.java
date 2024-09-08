package lotto.view.message;

public enum LottoGameMessage {
    INPUT_PURCHASE_AMOUNT("구입금액을 입력해 주세요."),
    LOTTO_COUNT("개를 구매했습니다."),
    INPUT_WINNING_LOTTO("당첨 번호를 입력해 주세요."),
    INPUT_BONUS_NUMBER("보너스 번호를 입력해 주세요.");

    private final String msg;

    LottoGameMessage(String msg) {
        this.msg = msg;
    }

    public String getMessage() {
        return msg;
    }
}
