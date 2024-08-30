package lotto.view;

import static lotto.view.message.LottoGameMessage.*;

import java.util.List;
import lotto.view.message.LottoGameMessage;

public class OutputView {
    public static void printMessage(LottoGameMessage message) {
        System.out.println(message.getMessage());
    }

    public static void printLottoCount(int lottoCount) {
        System.out.println("\n" + lottoCount + LOTTO_COUNT.getMessage());
    }

    public static void printErrorMessage(String error) {
        System.out.println(error + "\n");
    }

    public static void printLottoList(List<Integer> lotto) {
        System.out.println(lotto.toString());
    }
}
