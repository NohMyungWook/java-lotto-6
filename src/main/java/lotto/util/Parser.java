package lotto.util;

import lotto.view.constant.ErrorMessage;

public class Parser {
    public int parseNumber(String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ErrorMessage.NOT_A_NUMBER.getErrorMessage());
        }
    }
}
