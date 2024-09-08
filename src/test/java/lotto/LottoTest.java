package lotto;

import java.util.ArrayList;
import lotto.domain.Lotto;
import lotto.domain.Lottos;
import lotto.domain.RandomNumberGenerator;
import lotto.exception.InputFormatValidator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class LottoTest {
    @DisplayName("로또 번호의 개수가 6개가 넘어가면 예외가 발생한다.")
    @Test
    void createLottoByOverSize() {
        assertThatThrownBy(() -> new Lotto(List.of(1, 2, 3, 4, 5, 6, 7)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("로또 번호에 중복된 숫자가 있으면 예외가 발생한다.")
    @Test
    void createLottoByDuplicatedNumber() {
        // TODO: 이 테스트가 통과할 수 있게 구현 코드 작성
        assertThatThrownBy(() -> new Lotto(List.of(1, 2, 3, 4, 5, 5)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    // 아래에 추가 테스트 작성 가능
    @DisplayName("로또 금액이 1,000으로 나누어떨어지지 않으면 예외가 발생한다.")
    @Test
    void amountCheckModZero() {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        int price = 2001;

        assertThatThrownBy(() -> randomNumberGenerator.generate(price))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 로또 구매 금액이 1,000원으로 나누어 떨어지지 않습니다.");
    }

    @DisplayName("로또 금액에 숫자가 입력되지 않은 경우")
    @Test
    void amountCheckInputFormat() {
        InputFormatValidator validator = new InputFormatValidator();
        String invalidInput = "1000a"; // 숫자가 아닌 문자가 포함된 입력

        assertThatThrownBy(() -> validator.purchaseInput(invalidInput))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 로또 구매 금액은 숫자로 입력해주세요.");
    }
}