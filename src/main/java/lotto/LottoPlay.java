package lotto;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import camp.nextstep.edu.missionutils.Randoms;

public class LottoPlay implements Play{
    private final Controller controller = new Controller();
    private final View view = new View();

    @Override
    public void start() {
        int purchaseQuantity = getPurchaseQuantity();
        List<Lotto> myLotto = getMyLottoNumber(purchaseQuantity);
        Lotto winningLotto = readWinningNumber();
        int bonusNumber = readBonusNumber(winningLotto);
        printWinningStat();
        printYieldRate();
    }

    private int getPurchaseQuantity() {
        int purchaseQuantity = 0;

        do {
            try {
                System.out.print(view.getAskPurchaseAmount());
                purchaseQuantity = controller.getPurchaseQuantity();
            } catch (NumberFormatException e) {
                System.out.println(ErrorMessage.NOT_A_NUMBER.getErrorMessage());
            } catch (IllegalArgumentException e) {
                System.out.println(ErrorMessage.NOT_SEPARATED_1000.getErrorMessage());
            }
        } while (purchaseQuantity == 0);

        return purchaseQuantity;
    }

    private List<Lotto> getMyLottoNumber(int purchaseQuantity) {
        List<Lotto> myLotto = new ArrayList<>();
        List<Integer> numbers;

        System.out.println();
        System.out.print(view.getPrintPurchaseAmount(purchaseQuantity));

        for (int i = 0; i < purchaseQuantity; i++) {
            numbers = Randoms.pickUniqueNumbersInRange(1, 45, 6);
            myLotto.add(new Lotto(numbers));

            System.out.print(view.getPrintPurchaseNumber(myLotto.get(i)));
        }

        return myLotto;
    }

    private Lotto readWinningNumber() {
        Lotto lotto = null;

        System.out.println();
        System.out.print(view.getAskWinningNumber());

        do {
            try {
                lotto = new Lotto(controller.readWinningNumber());
            } catch (IllegalArgumentException e) {
                System.out.println(ErrorMessage.INVALID_WINNING_NUMBER.getErrorMessage());
            }
        } while (lotto == null);

        return lotto;
    }

    private int readBonusNumber(Lotto winningLotto) {
        int bonusNumber;

        System.out.println();
        System.out.print(view.getAskBonusNumber());

        do {
            try {
                bonusNumber = controller.readBonusNumber();
                validateBonusNumber(bonusNumber, winningLotto);
            } catch (IllegalArgumentException e) {
                System.out.println(ErrorMessage.INVALID_BONUS_NUMBER.getErrorMessage());
                bonusNumber = 0;
            }
        } while (bonusNumber == 0);

        return bonusNumber;
    }

    private void printWinningStat() {

    }

    private void printYieldRate() {

    }

    private void validateBonusNumber(int bonusNumber, Lotto winningLotto) {
        if (winningLotto.getLottoNumber().contains(bonusNumber)) {
            throw new IllegalArgumentException();
        }
    }

}
