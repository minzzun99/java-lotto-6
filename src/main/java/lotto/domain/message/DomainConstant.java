package lotto.domain.message;

public enum DomainConstant {
    START_RANGE(1),
    END_RANGE(45),
    NUMBER_COUNT(6),
    LOTTO_PRICE(1000);

    public final int number;

    DomainConstant(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
