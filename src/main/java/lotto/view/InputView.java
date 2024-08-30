package lotto.view;

import static lotto.view.OutputView.*;
import static lotto.view.message.LottoGameMessage.*;

import camp.nextstep.edu.missionutils.Console;
import lotto.exception.InputFormatValidator;

public class InputView {
    static InputFormatValidator inputFormatValidator = new InputFormatValidator();

    // 구매 금액 입력 받는 메서드
    public static int inputPurchaseLotto() {
        printMessage(INPUT_PURCHASE_AMOUNT);
        return inputFormatValidator.purchaseInput(Console.readLine().replaceAll("\\s", ""));
    }
}
