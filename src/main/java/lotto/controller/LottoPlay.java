package lotto.controller;

import lotto.view.InputView;
import lotto.view.constant.ViewMessage;

import static lotto.common.Constants.INITIALIZE_NUMBER;
import static lotto.common.Constants.POSSIBLE_TO_PURCHASE;

public class LottoPlay {
    InputView inputView = new InputView();
    public void start() {
        int numberOfPurchases = purchaseLotto();
    }

    public int purchaseLotto() {
        int purchaseAmount;
        ViewMessage.ASK_PURCHASE_AMOUNT.print();

        do {
            purchaseAmount = inputView.getNumberOfPurchases();
        } while (purchaseAmount == INITIALIZE_NUMBER);

        return purchaseAmount / POSSIBLE_TO_PURCHASE;
    }
}
