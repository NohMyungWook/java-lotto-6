package lotto.view.constant;

public enum ViewMessage {
    ASK_PURCHASE_AMOUNT("구입금액을 입력해 주세요."),
    ASK_WINNING_NUMBERS("당첨 번호를 입력해 주세요."),
    ASK_BONUS_NUMBER("보너스 번호를 입력해 주세요."),
    PURCHASE_INTRODUCE("%d개를 구매했습니다."),
    PURCHASE_HISTORY("%s"),
    WINNING_STATISTICS("당첨 통계"),
    SEPARATOR_LINE("---"),
    WINNING_AMOUNT("%s"),
    RETURN_RATE("총 수익률은 %.1f입니다.")
    ;

    private final String message;

    ViewMessage(String message) {
        this.message = message;
    }

    public void print() {
        System.out.println(message);
    }
}
