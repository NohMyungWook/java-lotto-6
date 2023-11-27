package lotto;

import camp.nextstep.edu.missionutils.Console;
import lotto.controller.LottoPlay;

public class Application {
    public static void main(String[] args) {
        LottoPlay lottoPlay = new LottoPlay();
        lottoPlay.start();
        Console.close();
    }
}
