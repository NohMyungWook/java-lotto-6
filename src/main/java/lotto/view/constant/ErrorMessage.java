package lotto.view.constant;

public enum ErrorMessage {
    PREFIX("[ERROR] "),
    SUFFIX(" 다시 입력해주세요."),
    NOT_A_NUMBER("숫자가 아닙니다."),
    INVALID_PURCHASE_AMOUNT("올바른 구매 금액이 아닙니다.")
    ;

    private final String errorMessage;

    ErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void print() {
        System.out.println(PREFIX.errorMessage + errorMessage + SUFFIX.errorMessage);
    }
}
