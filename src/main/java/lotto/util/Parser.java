package lotto.util;

import lotto.view.constant.ErrorMessage;

public class Parser {
    public static int parseNumber(String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            throw new NumberFormatException(ErrorMessage.NOT_A_NUMBER.getErrorMessage());
        }
    }
}
