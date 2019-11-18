package day12_hashset;

import java.util.HashSet;

public class LottoMain {
    public static void main(String[] args) {
        Lotto lotto = LottoUtil.getLotto();
        System.out.println(lotto);
        
        HashSet<Lotto> lottos = LottoUtil.getLottos(100);
        System.out.println(lottos);
    }
}
