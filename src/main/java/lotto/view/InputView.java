package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import lotto.util.Parser;
import lotto.util.Validator;
import lotto.view.constant.ErrorMessage;
import lotto.view.constant.ViewMessage;

import static lotto.common.Constants.INITIALIZE_NUMBER;

public class InputView {
    public int getNumberOfPurchases() {
        int purchaseAmount;

        try {
            purchaseAmount = Parser.parseNumber(Console.readLine());
            Validator.validateDividedByThousand(purchaseAmount);
            return purchaseAmount;
        } catch (NumberFormatException e) {
            ErrorMessage.NOT_A_NUMBER.print();
        } catch (IllegalArgumentException e) {
            ErrorMessage.INVALID_PURCHASE_AMOUNT.print();
        }

        return INITIALIZE_NUMBER;
    }
}
