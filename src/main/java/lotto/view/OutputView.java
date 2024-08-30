package lotto.view;

import lotto.view.message.LottoGameMessage;

public class OutputView {
    public static void printMessage(LottoGameMessage message) {
        System.out.println(message.getMessage());
    }

    public static void printLottoCount(LottoGameMessage message, int lottoCount) {
        System.out.println();
    }

    public static void printErrorMessage(String error) {
        System.out.println(error + "\n");
    }
}
