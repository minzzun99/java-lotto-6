package lotto.view;

import static lotto.view.message.LottoGameMessage.*;

import java.util.List;
import lotto.view.message.LottoGameMessage;

public class OutputView {
    public static void printMessage(LottoGameMessage message) {
        System.out.println(message.getMessage());
    }

    public static void printLottoCount(int lottoCount) {
        StringBuilder sb = new StringBuilder();
        sb.append('\n').append(lottoCount).append(LOTTO_COUNT.getMessage());
        System.out.println(sb);
    }

    public static void printErrorMessage(String error) {
        System.out.println(error + "\n");
    }

    public static void printLottoList(List<Integer> lotto) {
        System.out.println(lotto.toString());
    }
}
