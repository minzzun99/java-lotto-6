package lotto.view;

import static lotto.view.OutputView.*;
import static lotto.view.message.LottoGameMessage.*;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;
import lotto.exception.InputFormatValidator;

public class InputView {
    static InputFormatValidator validator = new InputFormatValidator();

    // 구매 금액 입력 받는 메서드
    public static int inputPurchaseLotto() {
        printMessage(INPUT_PURCHASE_AMOUNT);
        return validator.purchaseInput(Console.readLine().replaceAll("\\s", ""));
    }

    // 당첨 번호 입력 받는 메서드
    public static List<Integer> inputWinningLotto() {
        printMessage(INPUT_WINNING_LOTTO);
        return validator.winningLottoInput(Console.readLine());
    }
}
