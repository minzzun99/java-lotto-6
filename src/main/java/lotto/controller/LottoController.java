package lotto.controller;

import static lotto.view.InputView.*;
import static lotto.view.OutputView.*;

import lotto.domain.Lottos;
import lotto.domain.RandomNumberGenerator;

public class LottoController {
    public static void purchaseLottos() {
        try {
            // 금액 입력받기
            int price = inputPurchaseLotto();

            // 금액만큼 랜덤 숫자 생성
            RandomNumberGenerator generator = new RandomNumberGenerator();
            Lottos lottoList = new Lottos(generator.generate(price));

            // 로또 번호 출력 메서드 실행
            lottoListPrint(lottoList);
        } catch (IllegalArgumentException e) {
            printErrorMessage(e.getMessage());
            purchaseLottos();
        }
    }

    public static void lottoListPrint(Lottos lottoList) {

    }
}
