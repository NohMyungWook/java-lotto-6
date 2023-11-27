package lotto.util;

import lotto.view.constant.ErrorMessage;

import static lotto.common.Constants.INITIALIZE_NUMBER;
import static lotto.common.Constants.POSSIBLE_TO_PURCHASE;

public class Validator {

    public static void validateDividedByThousand(int amount) {
        if (amount % POSSIBLE_TO_PURCHASE != INITIALIZE_NUMBER)
            throw new IllegalArgumentException(ErrorMessage.INVALID_PURCHASE_AMOUNT.getErrorMessage());
    }
}
